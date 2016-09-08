package com.sooraj.domparser;

import java.sql.*;

public class DBUtils {
	static Connection con;
	// Static block to load the driver just once
	static {
		try {
			// Step 1: Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to load the Driver. Please check your Classpath");
		}
	}

	public static Connection getConnection() {
		// Step 2: Get the connection by passing the URL
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "root");
		} catch (Exception e) {
			System.out.println("Unable to get connection");
			e.printStackTrace();
		}
		return con;
	}

	public static void closeConnection() {
		try {
			// Step 7: Close the connection.
			con.close();
		} catch (Exception e) {
			System.out.println("Failed to close the connection");
		}
	}
}
