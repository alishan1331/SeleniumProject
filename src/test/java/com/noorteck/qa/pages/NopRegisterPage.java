package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopRegisterPage {

	@FindBy(xpath = "//strong[normalize-space()='Your Personal Details']")
	WebElement personalDetails;

	@FindBy(id = "gender-male")
	WebElement maleCircle;

	@FindBy(id = "gender-female")
	WebElement femaleCircle;

	@FindBy(name = "FirstName")
	WebElement firstNameField;

	@FindBy(name = "LastName")
	WebElement lastNameField;

	@FindBy(name = "DateOfBirthDay")
	WebElement DayDropDown;

	@FindBy(name = "DateOfBirthMonth")
	WebElement MonthDropDown;

	@FindBy(name = "DateOfBirthYear")
	WebElement yearDropDown;

	@FindBy(name = "Email")
	WebElement emailField;

	@FindBy(xpath = "//strong[normalize-space()='Company Details']")
	WebElement companyDetailsText;

	@FindBy(name = "Company")
	WebElement companyField;

	@FindBy(xpath = "//strong[normalize-space()='Options']")
	WebElement optionsText;

	@FindBy(xpath = "//strong[normalize-space()='Your Password']")
	WebElement yourPasswordText;

	@FindBy(name = "Password")
	WebElement passwordField;

	@FindBy(name = "ConfirmPassword")
	WebElement cnfrmPassword;

	@FindBy(name = "register-button")
	WebElement registerBtn;

	public NopRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String personalDetailsText() {
		String result = "";
		result = personalDetails.getText();
		return result;

	}

	public void clickMale() {
		maleCircle.click();
	}

	public void clickFemale() {
		femaleCircle.click();
	}

	public void firstNameField(String FirstName) {
		firstNameField.sendKeys(FirstName);
	}

	public void lastNameField(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void dayDropDown(String dayDrop) {
		Select day = new Select(DayDropDown);
		day.selectByVisibleText(dayDrop);

	}

	public void monthDropDown(String monthDrop) {
		Select month = new Select(MonthDropDown);
		month.selectByVisibleText(monthDrop);
	}

	public void yearDropDown(String yearDrop) {
		Select year = new Select(yearDropDown);
		year.selectByVisibleText(yearDrop);
	}

	public void emailField(String email) {
		emailField.sendKeys(email);
	}

	public String companyText() {
		String result = "";
		result = companyDetailsText.getText();
		return result;
	}

	public void companyField(String company) {
		companyField.sendKeys(company);
	}

	public String optionsText() {
		String result = "";
		result = optionsText.getText();
		return result;
	}

	public String yourPassowrdText() {
		String result = "";
		result = yourPasswordText.getText();
		return result;
	}

	public void passwordField(String Password) {
		passwordField.sendKeys(Password);
	}

	public void confirmPassword(String password) {
		cnfrmPassword.sendKeys(password);
	}

	public void clickRegister() {
		registerBtn.click();
	}
}
