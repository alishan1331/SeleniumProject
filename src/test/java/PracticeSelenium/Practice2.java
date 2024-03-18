package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Practice2 extends Hooks {

	public static void main(String[] args) {

		setUp();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement registerBtn = driver.findElement(By.linkText("REGISTER"));
		registerBtn.click();

		String currentPageTitle = driver.getTitle();

		if (currentPageTitle.equals("Mercury Tours")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not Verified");
		}

		WebElement enterFirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		enterFirstName.sendKeys("ali");
		
		WebElement enterLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		enterLastName.sendKeys("kad");
		
		WebElement enterPhoneNum = driver.findElement(By.xpath("//input[@name='phone']"));
		enterPhoneNum.sendKeys("444-222-1111");

		tearDown();
	}

}
