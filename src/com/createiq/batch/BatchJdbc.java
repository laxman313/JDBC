package com.createiq.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class BatchJdbc {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_kart?useSSL=false","root","root");
			con.setAutoCommit(false);
			java.sql.Statement stmt=con.createStatement();
			stmt.addBatch("insert into uday (u_id,u_name,balance) values(101,'laxamn',17000.000");
			stmt.addBatch("insert into uday (u_id,u_name,balance) values(102,'srikanth',20000.000");
			stmt.executeBatch();
			con.commit();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
