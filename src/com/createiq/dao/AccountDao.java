package com.createiq.dao;

import java.util.List;

import com.createiq.account.model.Account;

public interface AccountDao {
	// save,update,delete & findall
	void save(Account account);
	void update();
	int deleteByID(int ID);
	List<Account>findAll();

}
