package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	@FindBy(name = "firstName")
	WebElement firstNameField;
	
	@FindBy(name = "lastName")
	WebElement lastNameField;
	
	@FindBy(name = "country")
	WebElement countryDropDown;
	
	@FindBy(id = "email")
	WebElement userNameField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(name = "submit")
	WebElement submitBtn;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// firstname field
	
	public void firstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	// last name field
	
	public void lastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}
	
	// country 
	public void getCountry(String countryName){
		Select country = new Select(countryDropDown);
		country.selectByVisibleText(countryName);
	}
	
	public void userName(String username) {
		userNameField.sendKeys(username);
	}
	public void password(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
// rechekc this 
	public void clickLoginButton() {
		// TODO Auto-generated method stub
		
	}
	
}
