package PracticeSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Practice1 extends Hooks{
	
	
	
	public static void main(String[] args) {
		
		setUp();

		driver.get("https://www.ebay.com/");
		
		// implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement enterField = driver.findElement(By.id("gh-ac"));
		
		enterField.sendKeys("Books");
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
		
		searchBtn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
