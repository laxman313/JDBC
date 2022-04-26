package com.createiq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.createiq.account.model.Account;
import com.createiq.connectutil.ConnectionUtil;

public class AccountDaoImpl implements AccountDao {
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	@Override
	public void save(Account account) {
	Connection connection=ConnectionUtil.getConnection();
	try {
		PreparedStatement ps=connection.prepareStatement("insert into ac values(?,?,?)");
		ps.setInt(1, account.getAcno());
		ps.setString(2, account.getAcname());
		ps.setDouble(3, account.getBalance());
		
		int result=ps.executeUpdate();
		
		System.out.println(result);
	} catch (SQLException e) {
	System.out.println(e.getMessage());
	}
ConnectionUtil.closeConnection(connection);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteByID(int ID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> findAll(){
		Connection connection=ConnectionUtil.getConnection();
		List<Account> accounts=new ArrayList<>();
	try {
		PreparedStatement ps=connection.prepareStatement("select * from ac");
ResultSet rs=ps.executeQuery();
while(rs.next()) {
	Account account=new Account();
	account.setAcno(rs.getInt(1));
	account.setAcName(rs.getString(2));
	account.setBalance(rs.getDouble(3));
	accounts.add(account);
}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ConnectionUtil.closeConnection(connection);
		return accounts;
	}
	

}
