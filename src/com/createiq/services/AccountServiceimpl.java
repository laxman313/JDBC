package com.createiq.services;

import java.util.List;

import com.createiq.account.model.Account;
import com.createiq.dao.AccountDaoImpl;

public class AccountServiceimpl implements AccountService {
	AccountDaoImpl dao=new AccountDaoImpl();

	@Override
	public void save(Account account) {
		dao.save(account);
		
	}

	@Override
	public List<Account> findAll() {
	
		return dao.findAll();
	}
	

}
