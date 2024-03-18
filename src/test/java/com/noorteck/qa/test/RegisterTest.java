package com.noorteck.qa.test;

import com.noorteck.qa.pages.RegisterPage;

import utils.Hooks;

public class RegisterTest extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demo.guru99.com/test/newtours/register.php";
		String firstName = "alishan133";
		String lastName = "Kad";
		String country = "UNITED STATES";
		String userName = "akm6";
		String password = "123abc";
		
		setUp();
		
		
		driver.get(url);
		
		RegisterPage regObj = new RegisterPage(driver);
		
		
		regObj.firstName(firstName);
		Thread.sleep(2000);
		regObj.lastName(lastName);
		Thread.sleep(2000);
		regObj.getCountry(country);
		Thread.sleep(2000);
		regObj.userName(userName);
		Thread.sleep(2000);
		regObj.password(password);
		Thread.sleep(2000);
		regObj.clickSubmitBtn();
		
		
		
		
		tearDown();
		
	}
	
	

}
