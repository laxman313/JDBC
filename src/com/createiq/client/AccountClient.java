package com.createiq.client;

import com.createiq.account.model.Account;
import com.createiq.services.AccountServiceimpl;

public class AccountClient {
	public static void main(String[] args) {
		AccountServiceimpl service=new AccountServiceimpl();
		Account account=new Account(103, "lucky",17000.00);
		service.save(account);
		
	}

}
