  package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	@FindBy(xpath = "//h6")
	List<WebElement>headerTextList;
	
	@FindBy(xpath ="//span[text()='Job ']")
	WebElement jobDropdown;
	
	
	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li//a")
	List<WebElement>jobDropdownOptions;
	
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickJobDropdown() {
		jobDropdown.click();
	}
	
	
	public String getHeaderText() {
		String result = "";
		
		for(WebElement el : headerTextList) {
			String text = el.getText();
			result = result + text;
		}
		
		//TODO finish the remaining logic for text  after runnign the code... 
		
		return result;
	}
	

	public void selectValueFromJobDropdown(String value) {
		for(WebElement el: jobDropdownOptions) {
			String text = el.getText();
			
			if(text.equals(value)) {
				el.click();
				break;
			}
		}
	}
	
	
	

}