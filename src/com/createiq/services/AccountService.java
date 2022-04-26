package com.createiq.services;

import java.util.List;

import com.createiq.account.model.Account;

public interface AccountService {
	void save(Account account);
	List<Account>findAll();

}
