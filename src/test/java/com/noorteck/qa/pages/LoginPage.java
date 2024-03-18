package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Part 2
		@FindBy(name = "username")
		WebElement usernameField;
		
		@FindBy(name = "password")
		WebElement passwordField;
		
		@FindBy(xpath = "//*[text()=' Login ']")
		WebElement loginButton;
		
		
		@FindBy(xpath = "//p[text()='Invalid credentials']")
		WebElement invalidCredentialsText;
		
		//Part 3
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//Part 4
		
		
		//usernameField --> entering a value
		public void enterUsername(String username) {
			usernameField.sendKeys(username);
		}
		
		
		//passwordField --> entering a value
		public void enterPassword(String password) {
			passwordField.sendKeys(password);
		}
		
		
		//loginbutton --> clicking
		public void clickLoginButton() {
			loginButton.click();
		}
		
		
		
		public String getInvalidCredentialText() {
			String result = "";		
			result = invalidCredentialsText.getText();
			
			return result;
		}
		
	}




	/**

		Part 1. Create a java class for the webpage

		Part 2. (Create Object Repository)
				Inspect the elements from the webpage then store in the java class as webELement Object
				Now to locate the elements we will use 
						@FindBy


		Part 3. Create a Class Constructor and call initElements() from PageFactory Class
		
		
		Part 4. Create a method to perform specific action with elements 
	*/