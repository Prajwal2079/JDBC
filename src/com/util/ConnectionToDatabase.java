package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDatabase {

	private static Connection con;
	
	public static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root123");
		System.out.println("Connection established");
	}
	
	public static Connection getConnection() {
		if(con!=null)
			return con;
		return null;
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
