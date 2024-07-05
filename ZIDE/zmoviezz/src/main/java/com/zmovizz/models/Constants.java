//$Id$
package com.zmovizz.models;

public class Constants {
	public static enum Tables{
		USER_DETAILS("UserController","UserDao","User"),
		MOVIE_DETAILS("MovieController","MovieDao","Movie"),
		LOCATIONS("LocationController","LocationDao","Location"),
		TICKET_DETAILS("TicketController","TicketDao","Ticket"),
		THEATER_DETAILS("TheaterController","TheaterDao","Theater"),
		SHOW_DETAILS("ShowController",	"ShowDao","Show"),
		PAYMENT_DETAILS("PaymentController","PaymentDao","Payment"),
		REVIEWS("ReviewController","ReviewDAO","Review");
		
		private String dao;
		private String controller;
		private String pojo;
		private String controllerPackage = "com.zmovizz.controller.";
		private String daoPackage ="com.zmovizz.persistance.";
		private String pojoPackage = "com.zmovizz.models.";
		

		Tables(String controller,String dao,String pojo) {
			this.pojo = pojoPackage+pojo;
			this.dao = daoPackage+dao;
			this.controller = controllerPackage+controller;
		}
		public  String getDao() {
			return this.dao;
		}
		public String getController() {
			return this.controller;
		}
		public String getPojo() {
			return this.pojo;
		}

		public String get() {
			return super.toString().toLowerCase();
		}
	}
		
		public static enum Status{
			SUCCESS,
			FAIELD,
			PENDING,
			CANCELLED;
			
		}
		
		public static enum User{
			 ADMIN,
			 MANAGER,
			 CUSTOMER;
			 
			 
		 }
		 
		public static enum MovieType {
			 ACTION,
			 HISTORICAL,
			 CRIME,
			 COMEDY,
			 DRAMA,
			 ADVENTURE,
			 HORROR,
			 ROMANCE,
			 SCIENCE_FICTION,
			 FANTACY;
		 }
		
		public static enum StatusCode{
			NOT_FOUND(404),
			SQL_ERROR(500),
			OK(200),
			UNAUTHOURIZED(401),
			REFLECTION_ERROR(500),
			OTHER_ERROR(500);
			
			private int code;
			StatusCode(int code) {
				this.code = code;
			}
			public int get() {
				return this.code;
			}
			
			
			
		}
		public static enum MethodType{
			
			GET("get"),
			POST("set"),
			PUT("update"),
			DELETE("delete"),
			GET_ALL("getAll");

			private String name;

			MethodType(String name) {
				this.name = name;
			}
			public String get() {
				return this.name;
			}
		}
		public static enum PaymentMode{
			CREDIT_CARD,
			DEBIT_CARD,
			UPI,
			NET_BANKING
		}
		

}
