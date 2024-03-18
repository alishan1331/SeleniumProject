package com.noorteck.seleniumday7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoJS extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		//enterTextJS();
		//Thread.sleep(2000);
		//clickJS();
		//enterClick();
		//getPageTitle();
		//getElement();
		//navigateMethod();
		//navigateMethodJS();
		//hideElement();
		//scrollToBottom();
		//scrollToElement();
		scrollByPixel();
		tearDown();

	}

	// using java scriptExecutor --? enter a text

	public static void enterTextJS() {
		driver.get("https://www.ebay.com/");

		WebElement searchField = driver.findElement(By.id("gh-ac"));

		// step 1. create a JSExecutor object by DOWNCASTING the driver instance

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// step2. call the executeScript() and pass 2 parameters
		// param 1: we will pass JS COMMAND that browser understands
		// param 2: WebElement Object
		js.executeScript("arguments[0].value='Java Book'", searchField);
	}

	// 2 using JavaScriptExecutor --> click text

	public static void clickJS() {

		WebElement searchBtn = driver.findElement(By.id("gh-btn"));

		// step 1. create a JSExecutor object by DOWNCASTING the driver instance

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", searchBtn);

	}

	// 3. Using JavaScriptExecutor --> enter text then click button

	public static void enterClick() {
		driver.get("https://www.ebay.com/");

		WebElement searchField = driver.findElement(By.id("gh-ac"));
		WebElement searchBtn = driver.findElement(By.id("gh-btn"));

		// step1. create JavaScriptExecutor object by DOWNCASTING thedriver instance

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='Java Book'; arguments[1].click();", searchField, searchBtn);

	}

	// 4. using JavaScriptExecutor --> Retrive the page Title

	public static void getPageTitle() {

		driver.get("https://www.ebay.com/");

		// step1. create JavaScriptExecutor object by DOWNCASTING thedriver instance

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String title = js.executeScript("return document.title;").toString();

		System.out.println("Page Title:" + title);
		
	}
	
	// 5. using JavaScriptExecutor -- > retrieve the webElement text
	
	public static void getElement() {
		
		driver.get("https://www.ebay.com/");
		
		WebElement link = driver.findElement(By.linkText("Sporting Goods"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String text = js.executeScript("return arguments[0].innerText;",link).toString();
		
		System.out.println(text);
	}
	
	public static void navigateMethod() throws InterruptedException {
		
		/**
		 * in selenium we have 2 methods that we can use to navigate to the URL
		 * 1. driver.get(URL)
		 * 2. driver.navigate().to(URL);
		 */
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.Walmart.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.bestBuy.com/");
		Thread.sleep(2000);
		
		// go backwards
		
		driver.navigate().back(); // will go to walnart
		Thread.sleep(2000);
		driver.navigate().back(); // will go to ebay
		Thread.sleep(2000);
		
		//go forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		// refresh the page
		driver.navigate().refresh();
		
		
	}
	public static void navigateMethodJS() throws InterruptedException {
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.Target.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.bestBuy.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// using javaScriptExecutor --> Simulate BackWard feature
		
		/**
		 * Approach1:
		 * Approach2:
		 */
		//Approach1:
		js.executeScript("window.history.back();");
		Thread.sleep(2000);
		
		//Approach2:
		js.executeScript("history.go(-1)");	
		
		
		// using JavaScirptExecutor --> simulate Forward
		
		//Approach1:
		js.executeScript("window.history.forward();");
		Thread.sleep(2000);
		
		//Approach2:
		js.executeScript("history.go(1)");	
		
		//using JavaScirptExecutor --> simulate Refresh

		//Approach1:
		js.executeScript("window.history.reload();");
		Thread.sleep(2000);
		
		//Approach2:
		js.executeScript("history.go(0)");	
		
		
				
	}
	
	// using JavaScirptExecutor --> interact with the HIDDEN ELEMENT
		// what is hidden element? --> Element is not displayed on the page but it exists in HTML DOM
	
	public static void hideElement() throws InterruptedException {
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		WebElement textField = driver.findElement(By.id("displayed-text"));
		
		Thread.sleep(2000);
		
		textField.sendKeys("Java is fun");
		
		// clear the text
		textField.clear();
		
		// click hide button
		hideBtn.click();
		
		//textField.sendKeys("John"); // wont work because we hid the button and will throw exceeption
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value='John';", textField);
		
		Thread.sleep(2000);
		
		showBtn.click();
	}
	
	// using JavaScirptExecutor --> Scroll down to the bottom of the page
	
	public static void scrollToBottom() throws InterruptedException {
		
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		
		// scroll to botom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,(document.body.scrollHeight));");
		Thread.sleep(2000);
		
		// scroll to top
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,0);");
		
		Thread.sleep(2000);
	}
	
	//  using JavaScirptExecutor --> Scroll to specific element
	
	public static void scrollToElement() throws InterruptedException {
		
		driver.get("https://www.expedia.com/");
		Thread.sleep(2000);
		
		WebElement el = driver.findElement(By.xpath("(//*[contains(text(),'EARN UP TO 10X ONEKEYCASH')])[1]"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()", el);
		
		Thread.sleep(2000);
		
	}
	
	// using JavaScirptExecutor --> scroll by the pixel number 
		public static void scrollByPixel() throws InterruptedException {
		
			driver.get("https://www.ebay.com/");
			Thread.sleep(2000);
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,100);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,100);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,200);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,500);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-400);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-400);");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-200);");


	}
	
	

}
