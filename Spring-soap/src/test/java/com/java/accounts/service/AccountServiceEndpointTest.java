package com.java.accounts.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.accounts.AccountService;
import com.java.config.TestConfig;
import com.java.webservices.accountservice.AccountDetailsRequest;
import com.java.webservices.accountservice.AccountDetailsResponse;
import com.java.webservices.accountservice.EnumAccountStatus;
import com.java.webservices.accountservice.ObjectFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
public class AccountServiceEndpointTest {
	
	@Autowired
	@Qualifier("accountServiceClient")
	private AccountService accountsServiceClient;
	private AccountDetailsRequest accountDetailsRequest;
	
	@Before
	public void setUp() throws Exception {
		
		ObjectFactory objectFactory = new ObjectFactory();
		accountDetailsRequest = objectFactory.createAccountDetailsRequest();
		accountDetailsRequest.setAccountNumber("12345");
	}

	@Test
	public void testGetAccountDetails() throws Exception {
		
		AccountDetailsResponse response = accountsServiceClient.getAccountDetails(accountDetailsRequest);
		assertTrue(response.getAccountDetails()!= null);
		assertTrue(response.getAccountDetails().getAccountNumber().equals("12345"));
		assertTrue(response.getAccountDetails().getAccountName().equals("Joe Bloggs"));
		assertTrue(response.getAccountDetails().getAccountBalance() == 3400);
		assertTrue(response.getAccountDetails().getAccountStatus().equals(EnumAccountStatus.ACTIVE));
	}

}