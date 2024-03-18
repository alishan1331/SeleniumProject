package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TicketPage {

	@FindBy(xpath = "//input[@id='travname']")
	WebElement givenName; // this has /

	@FindBy(xpath = "//input[@placeholder='last name as on passport']")
	WebElement givenSurname; // this has 

	@FindBy(xpath = "//input[@id='dob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath = "//a[text()='15']")
	WebElement selectDay;

	@FindBy(xpath = "//input[@id='sex_1']")
	WebElement maleSelect;

	@FindBy(xpath = "//input[@id='sex_2']")
	WebElement femaleSelect;

	@FindBy(xpath = "//input[@id='traveltype_1']")
	WebElement oneWay;

	@FindBy(xpath = "//input[@id='traveltype_2']")
	WebElement RoundTrip;

	@FindBy(xpath = "//input[@id='fromcity']")
	WebElement fromCityBox;

	@FindBy(xpath = "//input[@id='tocity']")
	WebElement toCityBox;

	@FindBy(xpath = "//input[@id='departon']")
	WebElement departBox; // date picker

	@FindBy(xpath = "//select[@id='select2-reasondummy-container']")
	WebElement dummyTicketDropDown; // drop down

	@FindBy(xpath = "//input[@id='appoinmentdate']")
	WebElement subDate; // date picker

	@FindBy(xpath = "//input[@id='deliverymethod_1']")
	WebElement dummyTicketRadio;

	@FindBy(xpath = "//input[@id='billname']")
	WebElement billingNameField; // this has /

	@FindBy(xpath = "//input[@id='billing_phone']")
	WebElement phoneNumberField;

	@FindBy(xpath = "//input[@id='billing_email']")
	WebElement emailAddressField;

	@FindBy(xpath = "//select[@id='select2-billing_country-container']")
	WebElement selectCountry;

	@FindBy(xpath = "//input[@id='billing_address_1']")
	WebElement streetAddressField;

	@FindBy(xpath = "//input[@id='billing_city']")
	WebElement townField; // this has //

	@FindBy(xpath = "//select[@id='select2-billing_state-container']")
	WebElement stateDropDown;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	WebElement postalCodeField;

	@FindBy(xpath = "//input[@id='payment_method_paypal']")
	WebElement paypalRadio;

	@FindBy(xpath = "//button[@id='place_order']")
	WebElement proceedButton;

	public TicketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterGivenName(String name) {
		givenName.sendKeys(name);
	}

	public void enterLastGivenName(String surname) {
		givenSurname.sendKeys(surname);
	}

	public void enterDateOfBirth(String dob) {
		dateOfBirth.sendKeys(dob);
	}
	public void getSelectDay() {
		selectDay.click();
	}

	public void selectMale() {
		maleSelect.click();
	}

	public void selectFemale() {
		femaleSelect.click();
	}

	public void selectOneWay() {
		oneWay.click();
	}

	public void selectRoundTrip() {
		RoundTrip.click();
	}

	public void enterFromCity(String city) {
		fromCityBox.sendKeys(city);
	}

	public void enterToCity(String city) {
		toCityBox.sendKeys(city);
	}

    public void enterDepartureDate(String date) {
        departBox.sendKeys(date);
    }

    public void selectDummyTicket(String option) {
        Select dropdown = new Select(dummyTicketDropDown);
        dropdown.selectByVisibleText(option);
    }

    public void enterSubmissionDate(String date) {
        subDate.sendKeys(date);
    }

    public void selectDummyTicketRadio() {
        dummyTicketRadio.click();
    }

    public void enterBillingName(String name) {
        billingNameField.sendKeys(name);
    }

    public void enterPhoneNumber(String number) {
        phoneNumberField.sendKeys(number);
    }

    public void enterEmailAddress(String email) {
        emailAddressField.sendKeys(email);
    }

    public void selectCountry(String country) {
        Select dropdown = new Select(selectCountry);
        dropdown.selectByVisibleText(country);
    }

    public void enterStreetAddress(String address) {
        streetAddressField.sendKeys(address);
    }

    public void enterTown(String town) {
        townField.sendKeys(town);
    }

    public void selectState(String state) {
        Select dropdown = new Select(stateDropDown);
        dropdown.selectByVisibleText(state);
    }

    public void enterPostalCode(String code) {
        postalCodeField.sendKeys(code);
    }

    public void selectPaypalPayment() {
        paypalRadio.click();
    }

    public void clickProceedButton() {
        proceedButton.click();
    }
}


