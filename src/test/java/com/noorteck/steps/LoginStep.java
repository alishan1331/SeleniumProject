package com.noorteck.steps;

import com.noorteck.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Hooks;

public class LoginStep extends Hooks {

	LoginPage loginObj;

	@Given("User navigates to login page {string}")
	public void user_navigates_to_login_page(String string) {

		setUp();
		driver.get(string);
		loginObj = new LoginPage(driver);

	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {

		loginObj.enterUsername(string);
		
	}

	@When("user enters Password {string}")
	public void user_enters_password(String string) {

		loginObj.enterPassword(string);
	}

	@When("user click login button")
	public void user_click_login_button() {

		loginObj.clickLoginButton();
	}

	@Then("System redirects to dashboard page {string}")
	public void system_redirects_to_dashboard_page(String string) {

		System.out.println(string);
		
		tearDown();
	}
}