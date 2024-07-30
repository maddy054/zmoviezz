	package com.zmovizz.utility;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.stream.Stream;

import com.zmovizz.models.Constants.Language;
import com.zmovizz.models.Constants.MovieType;
import com.zmovizz.models.Constants.Tables;
import com.zmovizz.models.Constants.UserRole;

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
    private List<Integer> orderBy;
    private boolean isDecending;
    private boolean isLimit = false;
    private boolean isOffset = false;
    private boolean isLessThan = false;
    private boolean isGreaterThan = false;
    private List<Integer> between;
    private boolean isNeedCount = false;
    private boolean isLikeOperator = false;
    
    
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
        this.orderBy = new ArrayList<>();
     
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
    public QueryBuilder orderBy(int... columns) {
    	for(int column : columns) {
    		orderBy.add(column);
    	}
    	return this;
    }
    public QueryBuilder desc() {
    	this.isDecending = true;
    	return this;
    }
    public QueryBuilder like() {
    	this.isLikeOperator =true;
    	return this;
    }
    
    
	public QueryBuilder count(int count) {
		this.usedColumns.add(count);
		this.isNeedCount =true;
		return this;
	}
	public QueryBuilder lessThan() {
		this.isLessThan = true;
		return this;
	}
	public QueryBuilder greaterThan() {
		this.isGreaterThan = true;
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
        	int coulumIndex = i;
        	if(i>1) {
        		coulumIndex = i+1;
        	}
        	query.append(" join "+tableName[i]).append(" on ");
        	query.append(tableName[i-1]).append(".").append(getColumnNames(tableName[i-1],joinColumn.subList(coulumIndex-1, coulumIndex), false).get(0)).append(" = ");
        	query.append(tableName[i]).append(".").append(getColumnNames(tableName[i],joinColumn.subList(coulumIndex, coulumIndex+1), false).get(0));
        
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
                query.append(getColumnNames(tableName[0],whereConditions,false).get(i)).append(" = ?");
                
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
                query.append(getColumnNames(tableName[0],whereConditions,false).get(i));
                if(isGreaterThan) {
                	query.append(" > ?");
                }else if(isLessThan) {
                	query.append(" < ?");
                }else if(isLikeOperator) {
                	query.append(" LIKE ? ");
                }
                
                else {
                	query.append(" = ?");
                }
                
                if (i < whereConditions.size() - 1) {
                    query.append(" AND ");
                }
            }
        }
        if(!between.isEmpty()) {
        	
        	query.append(" AND ").append(getColumnNames(tableName[0],between,false).get(0)).append(" BETWEEN ? AND ? ");
        }
        
        if(!orderBy.isEmpty()) {
        	query.append(" ORDER BY ").append(getColumnNames(tableName[0],orderBy, false).get(0));
        	if(isDecending) {
        		query.append(" DESC ");
        	}
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
			List<String> columns = new ArrayList<>();
			
			for(int i =0;i<tableName.length;i++) {
				columns.addAll( getColumnNames(tableName[i],usedColumns,false));
			}
			
			
			//get the target class using reflection
			
			Class<?> targetObj = Class.forName(objClass.getName());
			
			
			
			
			//create a object for each entry
			while(resultSet.next()) {
				
				Object obj = targetObj.getDeclaredConstructor().newInstance();
				Field[] fields = targetObj.getDeclaredFields();
				
				if(!joinColumn.isEmpty()) {
					Class<?> joinClass = Class.forName(Tables.valueOf(tableName[1].toUpperCase()).getPojo());
					Field[] joinFields = joinClass.getDeclaredFields();
					fields = Stream.concat(Arrays.stream(fields), Arrays.stream(joinFields)).toArray(Field[]::new);
				 
					
				}
				
				for(int i=0;i<columns.size();i++) {
					Class<?> type = fields[i].getType();
					
					Object value = resultSet.getObject(i+1);
					
					if(type.equals(MovieType.class)) {
						
						value = MovieType.values()[Integer.parseInt(value.toString())];
					}
					else if(type.equals(Language.class)) {
						value =  Language.values()[Integer.parseInt(value.toString())];
					}else if(type.equals(UserRole.class)) {
						value = UserRole.values()[Integer.parseInt(value.toString())];
					}
					//get the getter and invoke
					Method method = targetObj.getMethod("set"+getCamelCase(columns.get(i)),type);	
					
					method.invoke(obj,value);
				}	
				
				// add all the object in list
				result.add(obj);
			}
			
			
		}catch(ClassNotFoundException| IllegalAccessException| IllegalArgumentException| InvocationTargetException| NoSuchMethodException| SecurityException| InstantiationException|SQLException e)  {
			e.printStackTrace();
		
		}
			return result;
		
	}

//	private List<Class<?>> getColumnType(ResultSetMetaData metaData) throws SQLException, ClassNotFoundException {
//		
//		List<Class<?>> columnType = new   ArrayList<Class<?>>();
//		
//		if(usedColumns.isEmpty()) {
//			
//			int count = metaData.getColumnCount();
//			
//			for(int i=1;i<=count;i++) {
//				columnType.add(Class.forName(metaData.getColumnClassName(i)));
//			}
//			
//		}else {
//			for(int i=0; i<usedColumns.size();i++) {
//				
//				columnType.add(Class.forName(metaData.getColumnClassName(i+1)));
//			}
//		}
//		return columnType;
//	}

	private void setValues(PreparedStatement statement,Object object) throws SQLException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	
		List<String> columns = getColumnNames(tableName[0],usedColumns,true);
		
		if(!whereConditions.isEmpty()) {
			columns.addAll(getColumnNames(tableName[0],whereConditions,false));
		}
		
		for(int i=0;i<columns.size();i++) {
				
				Method method = object.getClass().getDeclaredMethod("get"+getCamelCase(columns.get(i)));
			Object result = method.invoke(object);
			
			if(result.getClass().equals(MovieType.class)) {
				MovieType movie =(MovieType)result;
				result = movie.ordinal();
				
				
			}else if(result.getClass().equals(Language.class)) {
				Language language = (Language) result;
				result = language.ordinal();
			}else if(result.getClass().equals(UserRole.class)){
				UserRole user = (UserRole) result;
				result = user.ordinal();
			}
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