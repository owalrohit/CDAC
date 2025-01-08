package com.cdac.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection connection;

	public static Connection openConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/advjava";
		connection = DriverManager.getConnection(dbUrl, "root", "cdac");
		return connection;

	}

	public static void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
		System.out.println("connection closed");
	}

}
