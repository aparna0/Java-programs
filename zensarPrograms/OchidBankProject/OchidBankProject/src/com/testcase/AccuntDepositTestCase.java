package com.testcase;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.exception.InsufficientFundException;
import com.exception.InvalidAccNoException;
import com.provider.AccObjectProvider;
import com.services.AccountServices;

class AccuntDepositTestCase {
AccountServices accser;
	
	@BeforeAll
	public static void createInfra() {
		System.out.println("creating infrastructure");
	}
	
	/**
	 * Test method for {@link com.serviceImpl.AccServiceImpl#withdraw(int, float)}.
	 * @throws InvalidAccNoException 
	 * @throws InsufficientFundException 
	 * @throws SQLException 
	 */
	
	@Test
	public void testWithdraw() throws SQLException, InsufficientFundException, InvalidAccNoException {
		// to test update balance of deposit method
		accser = AccObjectProvider.getAccObject();
		System.out.println("test case running");
		Float updatedBalance = accser.deposit(100,100);
		// if updated balance is less than 0 then test case fails 
		assertTrue(updatedBalance > 0);
	}

	@AfterAll
	public static void clearInfra() {
		System.out.println("closeing infrastructure");
	}

}
