package com.onlineshopping.dal;


public class DBConfig {

	private String username;
	private String password;
	private String databaseURL;
	private String databaseName;
	
	public DBConfig(){
		username="root";
		password="Ibra1990";
		databaseURL="jdbc:mysql//localhost:3306/onlineshopping";// we have an error connecting our database to AWS so we used the localhost.
		databaseName="onlineshopping";
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getDatabaseURL() {
		return databaseURL+"/"+getDatabaseName();
	}
	
	public String getDatabaseName() {
		return databaseName;
	}
	
}
