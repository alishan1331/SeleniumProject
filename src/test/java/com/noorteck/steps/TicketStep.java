package com.noorteck.steps;

import com.noorteck.qa.pages.TicketPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.masterthought.cucumber.json.Hook;
import utils.Hooks;

public class TicketStep extends Hooks{

	TicketPage ticketObj;
	
	@Given("user navigates to url {string}")
	public void user_navigates_to_url(String string) {
	   
		setUp();
		driver.get(string);
		ticketObj = new TicketPage(driver);
	}


	@When("user enters first given name {string}")
	public void user_enters_first_given_name(String string) {
	   ticketObj.enterGivenName(string);
		
	}

	@When("user enters last given name  {string}")
	public void user_enters_last_given_name(String dob) {
	   ticketObj.enterLastGivenName(dob);
		
	}

	@When("user enters date of birth {string}")
	public void user_enters_date_of_birth(String string) {
		ticketObj.enterDateOfBirth(string); 
	  
	}

	@When("user selects male {string}")
	public void user_selects_male(String string) {
	   ticketObj.selectMale();
	}

	@When("user selects female {string}")
	public void user_selects_female(String string) {
	    ticketObj.selectFemale();
	}

	@When("user selects one way trip {string}")
	public void user_selects_one_way_trip(String string) {
	  ticketObj.selectOneWay();
	}

	@When("user selects round trip {string}")
	public void user_selects_round_trip(String string) {
	    ticketObj.selectRoundTrip();
	}

	@When("user selects city {string}")
	public void user_selects_city(String string) {
	    ticketObj.enterFromCity(string);
	}

	@When("user selects destination {string}")
	public void user_selects_destination(String string) {
	  ticketObj.enterToCity(string);
	}

	@When("user selects departure date {string}")
	public void user_selects_departure_date(String string) {
	   ticketObj.enterDepartureDate(string);
	}

	@When("user selects purpose of ticket {string}")
	public void user_selects_purpose_of_ticket(String string) {
	    ticketObj.selectDummyTicket(string);
	}

	@When("user selects appointment {string}")
	public void user_selects_appointment(String string) {
		ticketObj.enterSubmissionDate(string);
	}

	@When("user selects email option {string}")
	public void user_selects_email_option(String string) {
	   ticketObj.selectDummyTicketRadio();
	}

	@When("user enters Billing name {string}")
	public void user_enters_billing_name(String string) {
	  ticketObj.enterBillingName(string);
	}

	@When("user enters email address {string}")
	public void user_enters_email_address(String string) {
	    ticketObj.enterPhoneNumber(string);
	}

	@When("user selects country {string}")
	public void user_selects_country(String string) {
	    ticketObj.enterEmailAddress(string);
	}

	@When("user enters street address {string}")
	public void user_enters_street_address(String string) {
	   ticketObj.selectCountry(string);
	}

	@When("user enters the city {string}")
	public void user_enters_the_city(String string) {
	    ticketObj.enterStreetAddress(string);
	}

	@When("user selects the State {string}")
	public void user_selects_the_state(String string) {
	   ticketObj.enterTown(string);
	}

	@When("user types postal code {string}")
	public void user_types_postal_code(String string) {
	    ticketObj.selectState(string);
	}

	@When("user click paypal option to pay {string}")
	public void user_click_paypal_option_to_pay(String string) {
	   ticketObj.enterPostalCode(string);
	}

	@When("user click proceed to pay")
	public void user_click_proceed_to_pay() {
	   ticketObj.selectPaypalPayment();
	}

}
	
