package com.noorteck.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DatePicker1 extends Hooks{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.get("https://jqueryui.com/datepicker/#default");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		WebElement textField = driver.findElement(By.cssSelector("#datepicker"));
		textField.click();
		
		Thread.sleep(2000);
		
		WebElement selectNum = driver.findElement(By.xpath("//a[text()='23']"));
		selectNum.click();
		
		
		tearDown();
	}
}
