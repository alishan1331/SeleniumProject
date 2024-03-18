package com.noorteck.selenium.day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import utils.Hooks;

public class DemoWaits extends Hooks{
	
	public static void main(String[] args) {
		setUp();
		
		
		driver.get("https://www.letskodeit.com/practice");
		
		
		//implicit wait
		/*
		 * will wait for a specified amount of time for an element to be present in the DOM (Document Object Model) before throwing an exception.
		 */
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		
		bmwRadio.click();
		
		benzRadio.click();
		
		hondaRadio.click();
		
		System.out.println("*************************************");
		
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		
		hideBtn.click();
		
		// explicit wait
		/*
		 * Explicit waits can wait for elements to be visible, clickable, present, or any other condition defined by the Expected Conditions class in Selenium.
		 */
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayed-text"))).sendKeys("Java");
		
		
		
		tearDown();
	}

}
