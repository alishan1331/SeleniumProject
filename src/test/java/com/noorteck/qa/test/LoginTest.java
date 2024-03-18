package com.noorteck.qa.test;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.noorteck.qa.pages.LoginPage;

import utils.Hooks;

public class LoginTest extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://ntkhr.noortecktraining.com/web/index.php/auth/login";
		String username = "ntk-admin";
		String password = "Ntk-orange!admin.123";
		
		
		
		setUp();
		
		driver.get(url);
	/*	
		LoginPage loginObj = new LoginPage(driver);

		
		loginObj.enterUsername(username);
		loginObj.enterPassword(password);
		loginObj.clickLoginButton();
		*/
		//*****************************************************
		
		testCase2();
		
		tearDown();
		
	}

	
	public static void testCase2() throws InterruptedException {
		LoginPage loginObj = new LoginPage(driver);
		
		loginObj.enterUsername("abc");
		
		loginObj.enterPassword("123abc");

		loginObj.clickLoginButton();
		
		String message = loginObj.getInvalidCredText();
		
		System.out.println(message);
		
	}
	
	
	
}
