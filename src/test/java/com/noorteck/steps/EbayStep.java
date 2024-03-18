package com.noorteck.steps;
import com.noorteck.qa.pages.EbayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Hooks;
public class EbayStep extends Hooks {
	EbayPage ebayObj;
	@Given("User navigates to ebay page {string}")
	public void user_navigates_to_ebay_page(String url) {
	 setUp();
	 driver.get(url);
	
	 ebayObj = new EbayPage(driver);
	}
	@When("User enters product {string}")
	public void user_enters_product(String product) {
		 ebayObj.enterSearchValue(product);
	}
	@When("User clicks search button")
	public void user_clicks_search_button() {
		ebayObj.clickSearchButton();
	}
	@Then("user verifies search result")
	public void user_verifies_search_result() {
		System.out.println("Verified...");
		
		tearDown();
	}
}
