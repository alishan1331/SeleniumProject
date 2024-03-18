package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

	@FindBy(xpath="//*[text()='Admin']")
	WebElement adminMenu;
	
	@FindBy(xpath="//*[text()='PIM']")
	WebElement pimMenu;
	
	public MenuPage(WebDriver driver) {		
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdmin() {
		adminMenu.click();
	}
	
	public void clickPIM() {
		pimMenu.click();
	}
}


/**
1 .Create MenuPage Class

2. Inspect the highlighted elments and create webElement Object

3. Create Class Construtor

4. Create method for each element
 
		
*/