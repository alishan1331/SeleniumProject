package com.noorteck.steps;

import com.noorteck.qa.pages.DemoRegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Hooks;

public class DemoRegisterStep extends Hooks {
	
	DemoRegisterPage demoRegisterObj;
	

	@Given("User navigates to the DemoRegister Page {string}")
	public void navigate(String url) {
		
		setUp();
		driver.get(url);
		
		demoRegisterObj = new DemoRegisterPage(driver);
	}

	@When("User enters email {string}")
	public void email(String email) {
		demoRegisterObj.enterEmail(email);
	}

	@When("User enters phone {string}")
	public void phone(String phone) {
		demoRegisterObj.enterPhone(phone);
	}

	@When("User selects Gender Type {string}")
	public void setGender(String gender) {
		demoRegisterObj.selectGender(gender);
	}

	@When("User selects hobby {string}")
	public void setHobby(String hobby) {
		demoRegisterObj.selectHobby(hobby);
	}

	@When("User Selects DOB {string} {string} {string}")
	public void setDOB(String year, String month, String day) {
		demoRegisterObj.selectYear(year);
		demoRegisterObj.selectMonth(month);
		demoRegisterObj.selectDay(day);
	}

	@When("User enters psw {string}")
	public void password(String password) {
		demoRegisterObj.enterPassword(password);
	}

	@When("user confirms password {string}")
	public void confirmPassword(String password) {
		demoRegisterObj.enterConfPassword(password);
		
		tearDown();
		
	}

}