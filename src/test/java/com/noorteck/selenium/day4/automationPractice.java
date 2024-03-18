package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class automationPractice extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// retrive parent window ID
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window:" + parentWindow);
		Thread.sleep(2000);
		
		
		WebElement searchField = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		WebElement searchIcon = driver.findElement(By.cssSelector("input.wikipedia-search-button"));
		Thread.sleep(2000);
		
		// STEP 1. Nike, Inc.
		searchField.sendKeys("Nike, Inc.");
		searchIcon.click();
		WebElement nikeLink = driver.findElement(By.linkText("Nike, Inc."));
		nikeLink.click();
		Thread.sleep(2000);
		
		// STEP 2. Puma (brand)
		searchField.clear();
		searchField.sendKeys("Puma (brand)");
		searchIcon.click();
		WebElement pumaLink = driver.findElement(By.linkText("Puma (brand)"));
		pumaLink.click();
		Thread.sleep(2000);
		
		// STEP 3. Adidas
		searchField.clear();
		searchField.sendKeys("Adidas");
		searchIcon.click();
		WebElement adidasLink = driver.findElement(By.linkText("Adidas"));
		adidasLink.click();
		Thread.sleep(2000);
		
		tearDown();
	}

}
