package com.onlineshopping.dal;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class is responsible for DB Connection on the AWS Cloud. However, we had an error connecting to AWS So we used the localhost instead.
 *
 *
 */

public class DBConnect {
public static void main(String[]args) throws Exception
{
	DBConfig config = new DBConfig();
	Class.forName("com.mysql.jdbc.Driver");
	String query="select username from student where userid=3";
	Connection conn = DriverManager.getConnection(config.getDatabaseURL(),config.getUsername(),config.getPassword()); ;
	System.out.println("Success connection");
}
}
