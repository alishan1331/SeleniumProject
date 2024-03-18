package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoRegisterPage {

	@FindBy(xpath = "//input[@type='email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@type='tel']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@type='radio']")
	List<WebElement> genderList;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> hobbyList;

	@FindBy(id = "yearbox")
	WebElement yearDropdown;

	@FindBy(xpath = "//select[@placeholder='Month']")
	WebElement monthDropdown;

	@FindBy(id = "daybox")
	WebElement dayDropdown;

	@FindBy(xpath = "//input[@id='firstpassword']")
	WebElement passwordField;
	@FindBy(xpath = "//input[@id='secondpassword']")
	WebElement confPasswordField;

	public DemoRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPhone(String phone) {
		phoneField.sendKeys(phone);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);

	}

	public void enterConfPassword(String password) {
		confPasswordField.sendKeys(password);
	}

	public void selectYear(String year) {
		Select selectObj = new Select(yearDropdown);

		selectObj.selectByVisibleText(year);
	}

	public void selectMonth(String month) {
		Select selectObj = new Select(monthDropdown);

		selectObj.selectByVisibleText(month);
	}

	public void selectDay(String day) {
		Select selectObj = new Select(dayDropdown);

		selectObj.selectByVisibleText(day);
	}

	public void selectHobby(String hobby) {

		for (WebElement hobbyElement : hobbyList) {

			String hobbyElementValue = hobbyElement.getAttribute("value");

			if (hobby.equals(hobbyElementValue)) {
				hobbyElement.click();
			}

		}

	}

	public void selectGender(String gender) {

		for (WebElement genderElement : genderList) {

			String genderElementValue = genderElement.getAttribute("value");

			if (gender.equals(genderElementValue)) {
				genderElement.click();
			}

		}

	}

}