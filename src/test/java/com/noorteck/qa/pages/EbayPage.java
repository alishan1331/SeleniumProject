package com.noorteck.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class EbayPage {
	@FindBy(id = "gh-ac")
	WebElement searchField;
	
	
	@FindBy(id = "gh-btn")
	WebElement searchButton;
	
	
	public EbayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchValue(String product) {
		searchField.sendKeys(product);
	}
	
	public void clickSearchButton() {
		searchButton.click();
	}
}
