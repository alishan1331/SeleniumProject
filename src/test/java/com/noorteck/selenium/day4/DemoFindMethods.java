package com.noorteck.selenium.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoFindMethods extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		setUp();
		driver.get("https://www.letskodeit.com/practice");
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		bmwRadio.click();
		Thread.sleep(2000);
		benzRadio.click();
		Thread.sleep(2000);
		hondaRadio.click();
		Thread.sleep(2000);
		System.out.println("*************************************");
		
		List<WebElement> radioList = driver.findElements(By.xpath("//input[@type='radio]"));
		
		for(WebElement car : radioList) {
			car.click();
			
			Thread.sleep(2000);
			
		
			
			System.out.println("*********************");
			List<WebElement> checkList = driver.findElements(By.xpath("//fieldset//input[@type='checkbox']"));
			
			for(WebElement car1: checkList) {
				car.click();
				Thread.sleep(2000);
			}
		}

		tearDown();
	}

}
