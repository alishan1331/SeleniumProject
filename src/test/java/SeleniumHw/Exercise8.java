package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import utils.Hooks;

public class Exercise8 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		// navigate to page
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		// switch to first frame
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		
		// enter accessing ifram
		WebElement enterIframe = driver.findElement(By.xpath("//input[@type='text']"));
		enterIframe.sendKeys("Accessing iFrame");
		
		// switch back to parent frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		 // click ifram with in an iframe
		WebElement iFrameBox = driver.findElement(By.linkText("Iframe with in an Iframe"));
		iFrameBox.click();
		Thread.sleep(2000);
		
		// go into first first frame
		driver.switchTo().frame(1);
		
		// switch to second frame
		
		driver.switchTo().frame(0);
		
		WebElement frameTwo = driver.findElement(By.xpath("//input[@type='text']"));
		frameTwo.sendKeys("iFrame is easy");
		
		// go back to default frame
		driver.switchTo().defaultContent();
		
		// click home link
		
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		homeLink.click();
		
		String webTitle = driver.getTitle();
		String expectedTitle = "Index";
		
		if(webTitle.equals(expectedTitle)) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		
		tearDown();
	}

}
