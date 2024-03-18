package com.noorteck.selenium.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
		WebElement textField = driver.findElement(By.cssSelector("input#datepicker"));
		textField.click();
		
		WebElement monthDrop = driver.findElement(By.xpath("//select[@class ='ui-datepicker-month']"));
		Select selectMonth = new Select(monthDrop);
		selectMonth.selectByVisibleText("Jul");
		Thread.sleep(2000);
		
		
		
		WebElement yearDrop = driver.findElement(By.xpath("//select[class='ui-datepicker-year"));
		Select selectYear = new Select(yearDrop);
		selectYear.deselectByVisibleText("2026");
		Thread.sleep(2000);
		
		
		WebElement day = driver.findElement(By.xpath("//a[text()='25]"));
		day.click();
		Thread.sleep(2000);
		
		tearDown();
	}

}
