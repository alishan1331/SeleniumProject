package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Hw3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);

		WebElement registerLink = driver.findElement(By.linkText("Register"));
		Thread.sleep(2000);
		registerLink.click();

		String pageTitle = driver.getTitle();

		if (pageTitle.equals("nopCommerce demo store. Register")) {
			System.out.println("Page Title there");
		} else {
			System.out.println("Not there");

			 WebElement maleRadio = driver.findElement(By.name("Gender"));
			 Thread.sleep(2000);
			 maleRadio.click();

			WebElement firstName = driver.findElement(By.id("FirstName"));
			Thread.sleep(2000);
			firstName.sendKeys("Alishan");

			WebElement LastName = driver.findElement(By.id("LastName"));
			Thread.sleep(2000);
			LastName.sendKeys("Kadirov");

			Thread.sleep(2000);

			tearDown();
		}
	}
}
