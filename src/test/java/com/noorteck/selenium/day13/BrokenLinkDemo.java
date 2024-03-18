package com.noorteck.selenium.day13;

 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Hooks;

public class BrokenLinkDemo extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.get("http://www.deadlinkcity.com/");
		
		
		/**
		 * Step 1. Retrieve all the links by using the tagName, we can use findElements() and
		 * 			locate the link  by the tagName and then store in List of WebElement
		 * 
		 */
		
		List<WebElement> allTheLinks = 	driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links in the page: " + allTheLinks.size());
		
		
		/**
		 * Step 2. Once we store all the links inside the LIST, now we have to loop through
		 * 			the list and then retrieve the ATTRIBUTE href value
		 */
		
		
		int brokenLinkCount = 0;
		int notBrokenLinkCount = 0;
		
		for(WebElement link: allTheLinks) {
			
			String hrefValue = link.getAttribute("href");
			
			System.out.println(hrefValue);
			
			
			//First check point check if hrefValue is null or empty
			//if its then we know it is broken
			if(hrefValue == null || hrefValue.isEmpty()) {
				brokenLinkCount++;
				continue;
			}
			
			//Use RestAssured Library, so we can make get request to the server then retrieve
					//the status code
			
			try {
				
				Response response = RestAssured.get(hrefValue);
				
				int statusCode = response.getStatusCode();
				
				
				if(statusCode >=400) {
					brokenLinkCount++;
				} else {
					notBrokenLinkCount++;
				}
				
			}catch(Exception e) {
				System.out.println("Exception while making get calll");
				e.printStackTrace();
				brokenLinkCount++;
			}		
		}
		
		System.out.println("Total Links:  "+ allTheLinks.size());
		System.out.println("Broken Link:  " + brokenLinkCount);
		System.out.println("NotBrokenLink: " + notBrokenLinkCount);
		
		
		Thread.sleep(2000);
		
		tearDown();
	}
}
