package com.noorteck.qa.test;

import com.noorteck.qa.pages.NopRegisterPage;

import utils.Hooks;

public class NopTest extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/register?returnUrl=%2F";
		String FirstName = "Alishan";
		String lastName = "Kad";
		String dayDrop = "31";
		String monthDrop = "January";
		String yearDrop = "2003";
		String email = "johncena123@gmail.com";
		String company = "IT_Services";
		String Password = "123abc";
		String password = "123abc";

		setUp();

		driver.get(url);

		NopRegisterPage regObj = new NopRegisterPage(driver);

		String message1 = regObj.personalDetailsText();
		System.out.println(message1);
		regObj.personalDetailsText();

		regObj.clickMale();
		Thread.sleep(1000);
		regObj.clickFemale();
		regObj.firstNameField(FirstName);
		Thread.sleep(1000);
		regObj.lastNameField(lastName);
		regObj.dayDropDown(dayDrop);
		regObj.monthDropDown(monthDrop);
		Thread.sleep(1000);
		regObj.yearDropDown(yearDrop);
		regObj.emailField(email);
		regObj.companyText();
		Thread.sleep(1000);
		regObj.companyField(company);
		regObj.optionsText();
		regObj.yourPassowrdText();
		Thread.sleep(1000);
		regObj.passwordField(Password);
		regObj.confirmPassword(password);
		Thread.sleep(1000);
		regObj.clickRegister();
		Thread.sleep(1000);
		
	

		tearDown();
	}
}
