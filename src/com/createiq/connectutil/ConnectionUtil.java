package com.createiq.connectutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	private static Connection connection = null;
	private static Properties properties = null;

	public static Connection getConnection() {
		properties = new Properties();
		try {
			properties.load(ConnectionUtil.class.getClassLoader()
					.getResourceAsStream("com/createiq/dp/properties/db.properties"));
			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
					properties.getProperty("pw"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		return connection;

	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		}
	public static void closeConnection(PreparedStatement ps, Connection connection) {

		if (ps != null) {
			try {
				ps.close();
				closeConnection(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection connection, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				closeConnection(ps, connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}



	public static void main(String[] args) {
		System.out.println(getConnection());
	}

	

	}