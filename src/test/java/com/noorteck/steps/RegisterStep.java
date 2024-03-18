package com.noorteck.steps;

import com.noorteck.qa.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Hooks;

public class RegisterStep extends Hooks {
	
	RegisterPage registerObj; 
	
	//Run your feature file then copy the method and paste here...
	
	// remove method body then write the required code 

	
	@Given("User navigates to Register Page {string}")
	public void user_navigates_to_register_page(String string) {
		setUp();
		driver.get(string);
		registerObj = new RegisterPage(driver);
		
	}

	@When("User enters firstname {string}")
	public void user_enters_firstname(String string) {
	   registerObj.firstName(string);
	}

	@When("User enters lastName {string}")
	public void user_enters_last_name(String string) {
		registerObj.lastName(string);
	}

	@When("User selects country {string}")
	public void user_selects_country(String string) {
	  registerObj.getCountry(string);
	}

	@When("User enters credentials {string} {string}")
	public void user_enters_credentials(String string, String string2) {
		
		registerObj.userName(string);
		registerObj.password(string2);
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
		registerObj.clickLoginButton();
		
		tearDown();
	}


}




