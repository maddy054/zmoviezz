	package com.zmovizz.utility;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class QueryBuilder {
	
	private String url = "jdbc:postgresql://localhost:5432/zmovizz";
	private String userName = "postgres";
	private String password = "";
    private String[] tableName;
    String driverClassName = "org.postgresql.Driver";
    
    private List<Integer> usedColumns;
    private List<Integer> whereConditions; 
    private List<Integer> joinColumn ;
    private boolean isLimit = false;
    private boolean isOffset = false;
    private List<Integer> between;
    private boolean isNeedCount = false;
    
    
    private Connection getConnection() throws SQLException {
    	try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return DriverManager.getConnection(url, userName, password);
	}
    
    public void seturl(String url) {
    	this.url = url;
    }
    public void setUserName(String userName) {
    	this.userName = userName;
    }
    public void setPassword(String password) {
    	this.password = password;
    }

    public QueryBuilder(String... tableName) {
        this.tableName = tableName;
        this.usedColumns = new ArrayList<>();
        this.whereConditions = new ArrayList<>();
        this.between = new ArrayList<>();
        this.joinColumn = new ArrayList<>();
     
    }

    public QueryBuilder column(int... columns) {
    	
        for (int column : columns) {
        	usedColumns.add(column);
        }
        return this;
    }
 
    public QueryBuilder where(int... conditions) {
    	
    	for(int condition : conditions) {
    		whereConditions.add(condition);
    	}
        
        return this;
    }
 
    public QueryBuilder limit() {
    	this.isLimit = true;
    	return this;
    }
    
    public QueryBuilder offset() {
    	this.isOffset = true;
    	return this;
    }
    
    public QueryBuilder between(int... columns) {
    	for(int column : columns) {
    		between.add(column);
    	}
     	return this;
    }
    
	public QueryBuilder count(int count) {
		this.usedColumns.add(count);
		this.isNeedCount =true;
		return this;
	}

	public QueryBuilder join(int... columns) {
		for(int column : columns) {
			joinColumn.add(column);
    	}
		return this;
	}
  
    public String buildSelect() throws SQLException {
        StringBuilder query = new StringBuilder("SELECT ");
      
        if (usedColumns.isEmpty()) {
        	
            query.append("*");
        } else {
        	if(isNeedCount) {
        		query.append(" COUNT(").append(getColumnNames(tableName[0],usedColumns,false).get(0)).append(")");
        		
        	}else {
        	
        	 List<String> selectColumns = getColumnNames(tableName[0], usedColumns,false);
        	 
            for (int i = 0; i < selectColumns.size(); i++) {
                query.append(selectColumns.get(i));
                if (i < selectColumns.size() - 1) {
                    query.append(", ");
                }
            }
        }
        }
        query.append(" FROM ").append(tableName[0]);
        
        for(int i=1;i<tableName.length;i++) {
        	
        	query.append(" join "+tableName[i]).append(" on ");
        	query.append(tableName[i-1]).append(".").append(getColumnNames(tableName[i-1],joinColumn.subList(i-1, i), false).get(0)).append(" = ");
        	query.append(tableName[i]).append(".").append(getColumnNames(tableName[i],joinColumn.subList(i, i+1), false).get(0));
        
        }
     
       buildWhere(query);
        System.out.println(query);

        return query.toString();

    }
    
    public String buildUpdate() throws SQLException {
        StringBuilder query = new StringBuilder("UPDATE ").append(tableName[0]).append(" SET ");
        
        List<String> updateColumns = getColumnNames(tableName[0],usedColumns,true);
        
        for (int i = 0; i < updateColumns.size(); i++) {
            query.append(updateColumns.get(i)).append(" = ?");
            if (i < updateColumns.size() - 1) {
                query.append(", ");
            }
        }

        if (!whereConditions.isEmpty()) {
        	
            query.append(" WHERE ");
            for (int i = 0; i < whereConditions.size(); i++) {
                query.append(getColumnNames(tableName[0],whereConditions,false).get(i)).append(" = ? ");
                if (i < whereConditions.size() - 1) {
                    query.append(" AND ");
                }
            }
        }
        System.out.println(query);
        return query.toString();
    }
    
    
    private void buildWhere(StringBuilder query) throws SQLException {
    	 
        if (!whereConditions.isEmpty()) {
            query.append(" WHERE ");
            for (int i = 0; i < getColumnNames(tableName[0],whereConditions,false).size(); i++) {
                query.append(getColumnNames(tableName[0],whereConditions,false).get(i)).append(" = ? ");
                
                if (i < whereConditions.size() - 1) {
                    query.append(" AND ");
                }
            }
        }
        if(!between.isEmpty()) {
        	
        	query.append(" AND ").append(getColumnNames(tableName[0],between,false).get(1)).append(" BETWEEN ? AND ? ");
        }
        if(isLimit) {
        	query.append(" LIMIT ? ");
        }
        if(isOffset) {
        	query.append(" OFFSET ? ");
        }
    	
    }
    
    
    
    
    public String buildInsert() throws SQLException {
        StringBuilder query = new StringBuilder("INSERT INTO ").append(tableName[0]);

        List<String> insertColumns = getColumnNames(tableName[0],usedColumns,true);
     
        	query.append(" (");
        	
        	 for (int i = 0; i < insertColumns.size(); i++) {
                 query.append(insertColumns.get(i));
                 if (i < insertColumns.size() - 1) {
                     query.append(", ");
                 }
             }
        	 query.append(") ");
    
 
        query.append(" VALUES (");

        for (int i = 0; i < insertColumns.size(); i++) {
            query.append("?");
            if (i < insertColumns.size() - 1) {
                query.append(", ");
            }
        }

        query.append(")");
 
        System.out.println(query);
        return query.toString();
    }
    
    private <V> List<String> getColumnNames(String table,List<V> column,boolean removePk) throws SQLException {
    	
    	List<String> columnNames = new ArrayList<String>();
        try(Connection connection = getConnection()) {
        	DatabaseMetaData metaData = connection.getMetaData();
        
        	 try (ResultSet rs = metaData.getColumns("zmovizz", null, table, null)) {
        		 
       
        		 if(column.isEmpty()) {
        			 while(rs.next()) {
        				
        				 if(!(removePk && (rs.getString("TYPE_NAME").equals("serial")))){
        					 columnNames.add(rs.getString("COLUMN_NAME")); 
        				 }
        				
        			 }
        		 }else {
        			 int count =1;
        			 while (rs.next()) {

        				 if(column.contains(count)) {
        					 
        					 columnNames.add(rs.getString("COLUMN_NAME")); 
        				 }
        				 count = count+1;
        			 }
        			 
        		 }
        			
        		return columnNames;
            }
        }
    }
    	
	public  List<Object> executeQuery(Class<?> clas,String query,Object... values) throws SQLException  {

	    	try (Connection connection = getConnection()) {
	    		
	    		PreparedStatement statement = connection.prepareStatement(query);
	    		setValues(statement, values);
	    			
	    		ResultSet resultSet = statement.executeQuery() ;
	    		try(resultSet){
	    			return setObject(clas, resultSet);
	    		}
	    	}    
		}
	
	public void execute(String query, Object values ) throws SQLException {
		
		try (Connection connection = getConnection()) {
    			PreparedStatement statement = connection.prepareStatement(query);
    		
				setValues(statement, values);
				statement.execute();
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | SQLException e) {
				CustomLogger.log(Level.INFO, e.getMessage(),e);
				e.printStackTrace();
			}
	}
	
	private void setValues(PreparedStatement statement,Object[] values) throws SQLException {
		
		
		
		for(int i=1;i <= values.length;i++) {
		
			statement.setObject(i,values[i-1]);
		}
	}
	
	
	private List<Object> setObject(Class<?> objClass,ResultSet resultSet) {
		List<Object> result = new ArrayList<Object>();
		try {
			ResultSetMetaData metaData = resultSet.getMetaData();
			List<String> columns = new ArrayList<>();
			
			for(int i =0;i<tableName.length;i++) {
				columns.addAll( getColumnNames(tableName[i],usedColumns,false));
			}
			
			
			//get the target class using reflection
			List<Class<?>> columnType = getColumnType(metaData);
			
			Class<?> targetObj = Class.forName(objClass.getName());
			
			
			
			
			//create a object for each entry
			while(resultSet.next()) {
				
				Object obj = targetObj.getDeclaredConstructor().newInstance();
				
				for(int i=0;i<columns.size();i++) {
					
					//get the getter and invoke
					Method method = targetObj.getDeclaredMethod("set"+getCamelCase(columns.get(i)),columnType.get(i));

					method.invoke(obj,resultSet.getObject(i+1));
				}	
				
				// add all the object in list
				result.add(obj);
			}
			
			
		}catch(ClassNotFoundException| IllegalAccessException| IllegalArgumentException| InvocationTargetException| NoSuchMethodException| SecurityException| InstantiationException|SQLException e)  {
			e.printStackTrace();
		
		}
			return result;
		
	}

	private List<Class<?>> getColumnType(ResultSetMetaData metaData) throws SQLException, ClassNotFoundException {
		
		List<Class<?>> columnType = new   ArrayList<Class<?>>();
		
		if(usedColumns.isEmpty()) {
			
			int count = metaData.getColumnCount();
			
			for(int i=1;i<=count;i++) {
				columnType.add(Class.forName(metaData.getColumnClassName(i)));
			}
			
		}else {
			for(int i=0; i<usedColumns.size();i++) {
				
				columnType.add(Class.forName(metaData.getColumnClassName(i+1)));
			}
		}
		return columnType;
	}

	private void setValues(PreparedStatement statement,Object object) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		List<String> columns = getColumnNames(tableName[0],usedColumns,true);
		
		if(!whereConditions.isEmpty()) {
			columns.addAll(getColumnNames(tableName[0],whereConditions,false));
		}
		
		for(int i=0;i<columns.size();i++) {
				System.out.println(columns.get(i));
				Method method = object.getClass().getDeclaredMethod("get"+getCamelCase(columns.get(i)));
			Object result = method.invoke(object);
			statement.setObject(i+1,result);	
		}
	
	}	
	private String getCamelCase(String str) {
		
		
		StringBuilder strBuilder =  new StringBuilder(str);
		
		//get the index of _ 
		int index = strBuilder.indexOf("_");
		
		//remove and convert it into camel case
		if(index != -1){
			strBuilder.deleteCharAt(index);
			strBuilder.setCharAt(index, String.valueOf( strBuilder.charAt(index)).toUpperCase().charAt(0));
		}
		return strBuilder.substring(0, 1).toUpperCase() + strBuilder.substring(1);
		
	}
	

	
}