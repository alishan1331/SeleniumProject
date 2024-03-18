package com.noorteck.selenium.day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import utils.Hooks;

public class DemoAdvanceActions extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		//doubleClickAction();
		//rightClickAction();
		//clickMe();
		//moveAction();
		//dragAndDrop1();
		//dragAndDrop3();
		keywordAction();

		tearDown();
	}
	
	public static void keywordAction() throws InterruptedException {
		driver.get("https://text-compare.com/");
		
		WebElement textField1 = driver.findElement(By.id("inputText1"));
		WebElement textField2 = driver.findElement(By.id("inputText1"));
		
		Actions actions = new Actions(driver);
		
		// step 1. Enter the text
		actions.sendKeys(textField1, "Java is Fun").build().perform();
		
		Thread.sleep(2000);
		
		//step 2. From keyword shortCut --> we need to select the text we enterd in the field1
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//step 3. once selected, then using keyword SHortCut --> we need to COPY the text
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		
		//step 4. From keyword shortCut --> we need to hit the TAB key
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		// step 5. from keyword SHortCut --> we need to paste the text into field2
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();		
		Thread.sleep(2000);
	}
	
	public static void dragAndDrop3() throws InterruptedException {
		
	driver.get("https://jqueryui.com/droppable/#photo-manager");
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
	
		List<WebElement> picList = driver.findElements(By.xpath("//ul[@id='gallery']//li"));
		Thread.sleep(2000);
		WebElement trash = driver.findElement(By.id("trash"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		for(WebElement pic : picList) {
		actions.dragAndDrop(pic, trash).build().perform();
		
		Thread.sleep(2000);
		}
	}
	
	public static void dragAndDrop2() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/#photo-manager");
		
		
		driver.switchTo().frame(0);
	
		List<WebElement> picList = driver.findElements(By.xpath("//ul[@id='gallery']//li"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions actions = new Actions(driver);
		
		for(WebElement pic : picList) {
		actions.clickAndHold(pic).moveToElement(trash).release().build().perform();
		}
	}
	
	public static void dragAndDrop1() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/#photo-manager");
		
		
		driver.switchTo().frame(0);
		
		WebElement pic1 = driver.findElement(By.xpath("//ul[@id='gallery']//li[1]"));
		WebElement pic2 = driver.findElement(By.xpath("//ul[@id='gallery']//li[2]"));
		WebElement pic3 = driver.findElement(By.xpath("//ul[@id='gallery']//li[3]"));
		WebElement pic4 = driver.findElement(By.xpath("//ul[@id='gallery']//li[4]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(pic1).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(pic2).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(pic3).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		actions.clickAndHold(pic4).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
	}
	
	public static void moveAction() {
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
			WebElement interactionEL = driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
			WebElement dragDropEl = driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]"));
			WebElement staticEl = driver.findElement(By.xpath("//a[contains(text(),'Static')]"));
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(interactionEL).moveToElement(dragDropEl).moveToElement(staticEl).click().build().perform();


	}

	public static void rightClickAction() throws InterruptedException {

		driver.get("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.id("rightClickBtn"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(button).build().perform();
		Thread.sleep(2000);
		
		WebElement message = driver.findElement(By.id("rightClickMessage"));
		
		String messageStr = message.getText();
		System.out.println(messageStr);
	}
	

	public static void doubleClickAction() throws InterruptedException {
		driver.get("https://demoqa.com/buttons");

		WebElement button = driver.findElement(By.id("doubleClickBtn"));

		Actions actions = new Actions(driver);

		actions.doubleClick(button).build().perform();

		Thread.sleep(2000);

		WebElement message = driver.findElement(By.id("doubleClickMessage"));
		String messageStr = message.getText();
		System.out.println(messageStr);
	}
	
	public static void clickMe() {
		driver.get("https://demoqa.com/buttons");
		
		WebElement button = driver.findElement(By.xpath("//button[text() = 'Click Me']"));
		
		button.click();
		
		
	}

}
