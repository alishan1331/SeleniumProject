package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoFrame extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		// navigate to page
		driver.get("https://www.letskodeit.com/practice");
		
		Thread.sleep(2000);
		// check bmw
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		bmwCheck.click();
		
		WebElement frame = driver.findElement(By.id("courses-iframe"));
		
		// switch to a different frame
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		// enter value in search course text fiield
		 WebElement searchField = driver.findElement(By.xpath("//input[@id='search']"));
		 searchField.sendKeys("Java");
		
		 Thread.sleep(2000);
		// click the search icon
		WebElement searchIcon = driver.findElement(By.cssSelector("button.find-course.search-course"));
		
		searchField.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		// check radio button
		
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		
		benzRadio.click();
		
		
		
		
		
		
		
		
		tearDown();
	}
}
