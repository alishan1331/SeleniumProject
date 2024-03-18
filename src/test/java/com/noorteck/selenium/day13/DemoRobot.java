package com.noorteck.selenium.day13;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;

public class DemoRobot extends Hooks {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		setUp();
		driver.get("http://the-internet.herokuapp.com/upload");
		
		Thread.sleep(2000);
		
		
		WebElement fileUploadButton = driver.findElement(By.id("file-upload"));
		
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(fileUploadButton).click().build().perform();
		
		
		//File Location --> TODO Change to your location
		String filePath = "C:\\Users\\arsla\\Desktop\\robot_b11";
		
		
		//Step 1. we have to perfomr CONTROL + C ( copy the filepath into clipart)
		StringSelection strSelection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		
		Robot robot = new Robot();
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);//Press control key
		robot.keyPress(KeyEvent.VK_V); //press the v key
		
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL); //Release contorl key
		robot.keyRelease(KeyEvent.VK_V); //Release v keyword
		
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		
		WebElement uploadBtn = driver.findElement(By.id("file-submit"));

		uploadBtn.click();
		
		Thread.sleep(2000);
		
		tearDown();
	}
}
