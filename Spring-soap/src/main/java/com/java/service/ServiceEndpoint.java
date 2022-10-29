package com.java.service;

import org.springframework.stereotype.Service;

import com.java.webservices.accountservice.Account;
import com.java.webservices.accountservice.AccountDetailsRequest;
import com.java.webservices.accountservice.AccountDetailsResponse;
import com.java.webservices.accountservice.EnumAccountStatus;
import com.java.webservices.accountservice.ObjectFactory;

@Service
public class ServiceEndpoint implements com.java.accounts.AccountService {
	
	@Override
	public AccountDetailsResponse getAccountDetails(AccountDetailsRequest parameters) {

		ObjectFactory factory = new ObjectFactory();
		AccountDetailsResponse response = factory.createAccountDetailsResponse();
		
		Account account = factory.createAccount();
		account.setAccountNumber("12345");
		account.setAccountStatus(EnumAccountStatus.ACTIVE);
		account.setAccountName("Joe Bloggs");
		account.setAccountBalance(3400);
		
		response.setAccountDetails(account);		
		return response;
	}
	
}