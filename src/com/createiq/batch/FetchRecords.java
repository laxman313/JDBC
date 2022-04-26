package com.createiq.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecords {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sai","root","root");
		con.setAutoCommit(false);
		Statement smt=con.createStatement();
		smt.addBatch("insert into sri values(101,'uday',25000");
		smt.addBatch("insert into sri values(102,'laxman',26000");
		smt.executeBatch();
		con.commit();
		con.close();
		

	}

}
