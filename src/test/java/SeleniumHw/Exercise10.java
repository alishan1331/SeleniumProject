package SeleniumHw;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.command.SearchImagesCmd;

import utils.Hooks;

public class Exercise10 extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.get("https://testautomationpractice.blogspot.com/");

		// a. In search field, enter selenium (software) then click search icon.
		WebElement searchField = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchField.sendKeys("selenium (software)");
		Thread.sleep(2000);

		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
		Thread.sleep(2000);

		// a1. Under Search results click first result selenium (software)
		WebElement selLink = driver.findElement(By.linkText("Selenium (software)"));
		selLink.click();
		Thread.sleep(2000);

		String parentWindow = driver.getWindowHandle();

		driver.switchTo().window(parentWindow);
		searchField.clear();
		Thread.sleep(2000);
		// B . In search field, enter eBay then click search icon.

		searchField.sendKeys("eBay");
		searchButton.click();
		Thread.sleep(2000);
		// B1. Under Search results click first result eBay

		WebElement ebayLink = driver.findElement(By.linkText("EBay"));
		ebayLink.click();
		Thread.sleep(2000);

		driver.switchTo().window(parentWindow);
		searchField.clear();
		Thread.sleep(2000);
		// C In search field, enter Target Corporation then click search icon.

		searchField.sendKeys("Target Corporation");
		searchButton.click();
		Thread.sleep(2000);

		// C1. Under Search results click first result Target Corporation

		WebElement targetLink = driver.findElement(By.linkText("Target Corporation"));
		targetLink.click();
		Thread.sleep(2000);

		driver.switchTo().window(parentWindow);
		searchField.clear();
		Thread.sleep(2000);

		// D. In search field, enter Google then click search icon.

		searchField.sendKeys("Google");
		searchButton.click();
		Thread.sleep(2000);

		// D1. Under Search results click first result Google

		WebElement googleLink = driver.findElement(By.linkText("Google"));
		googleLink.click();
		Thread.sleep(2000);

		driver.switchTo().window(parentWindow);
		searchField.clear();
		Thread.sleep(2000);

		// E. In search field, enter Yahoo! then click search icon.

		searchField.sendKeys("Yahoo!");
		searchButton.click();

		Thread.sleep(2000);

		// E1. Under Search results click first result Yahoo!

		WebElement yahooLink = driver.findElement(By.linkText("Yahoo!"));
		yahooLink.click();

		
		Thread.sleep(2000);
		
		
		// 4. Switch the control to window that has page title as Selenium (software) - Wikipedia
		
		Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("Window ID:" + allWindows);
		
		for(String window: allWindows) {
			System.out.println("Window ID:" + window);
		
		driver.switchTo().window(window);
		
		String currentPageTitle = driver.getTitle();
		Thread.sleep(2000);
		
	
		if(currentPageTitle.equals("Selenium (software) - Wikipedia")) {
			System.out.println("Selenium");
			
			WebElement SeleniumHomePage = driver.findElement(By.xpath("//a[@href='https://selenium.dev/']"));
			SeleniumHomePage.click();
			Thread.sleep(2000);
		
			
			String selHomePageTitle = driver.getTitle();
			System.out.println("Verify Title:" + selHomePageTitle);
			break;
	
		}
		
		}
		driver.switchTo().window(parentWindow);
		searchField.clear();
		Thread.sleep(2000);

		tearDown();
	

	}
}
