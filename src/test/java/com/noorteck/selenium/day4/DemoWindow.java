package com.noorteck.selenium.day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoWindow extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//retrieve parent window id
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window ID:" + parentWindow);
		
		WebElement searchField = driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
		WebElement searchIcon = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		
		
		//step 1. NIKE, inc
		searchField.sendKeys("Nike, Inc.");
		searchIcon.click();
		WebElement nikeLink = driver.findElement(By.linkText("Nike, Inc."));
		nikeLink.click();
		
		Thread.sleep(2000);
		
		searchField.clear();
		searchField.sendKeys("Puma (brand)");
		searchIcon.click();
		WebElement PumaLink = driver.findElement(By.linkText("Puma (brand)"));
		PumaLink.click();
		
		Thread.sleep(2000);
		
		searchField.clear();
		searchField.sendKeys("Adidas");
		searchIcon.click();
		WebElement adidasLink = driver.findElement(By.linkText("Adidas"));
		adidasLink.click();
		
		Thread.sleep(2000);
		
		/**
		 * Once we are done opening new tab/window, now we can retrieve all the WINDOW IDS using getwindowHandles()
		 * 
		 * getwindowHandles() will return all the ids (parent + child)
		 */
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("Window ID:" + allWindows);
		
		/** once we have all the window IDS, then we can iterate/loop through the set and interact/switch back & forth
		 * 
		 * 
		 * 
		 */
		
		for(String window: allWindows) {
			System.out.println("Window ID:" + window);
			
			
			// switch control to new window
			driver.switchTo().window(window);
			
			String currentPageTItle = driver.getTitle();
			if(currentPageTItle.equals("Nike, Inc. - Wikipedia")) {
				
				System.out.println("NIKE");		
				WebElement nikeHomePage = driver.findElement(By.xpath("//a[@href='https://nike.com']"));
				nikeHomePage.click();
				
				Thread.sleep(2000);
				
				String nikePageTitle = driver.getTitle();				
				System.out.println(nikePageTitle);
				
				driver.close();
				
			} else if (currentPageTItle.equals("Adidas - Wikipedia")) {
				
				System.out.println("ADIDAS");
				
				WebElement adidasHomePage = driver.findElement(By.xpath("//a[@href='https://adidas.com']"));
				adidasHomePage.click();	
				
				Thread.sleep(2000);
				
				String adidasPageTitle = driver.getTitle();				
				System.out.println(adidasPageTitle);
				
				driver.close();
				
			} else if (currentPageTItle.equals("Puma (brand) - Wikipedia")) {
				
				System.out.println("PUMA");
				
				WebElement pumaHomePage = driver.findElement(By.xpath("//a[@href='https://eu.puma.com/']"));
				pumaHomePage.click();	
				
				Thread.sleep(2000);
				String pumaPageTitle = driver.getTitle();				
				System.out.println(pumaPageTitle);
				
				driver.close();
				
			}
			

			
			}

			// before we enter value we need to switch the control back to parent window
			
			driver.switchTo().window(parentWindow);
			
			Thread.sleep(2000);
			WebElement nameField = driver.findElement(By.id("name"));
			
			nameField.sendKeys("John Cena");
		
		tearDown();
	}

	}

