package com.noorteck.selenium.day13;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.Hooks;

public class DemoScreenshot extends Hooks{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		setUp();
		
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		
		//step 1: create an object of TakeScreenshot by downcasting the driver instance
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		// Step 2: call the getScreenshotAs() method and pass the output.FILE as parameter then store in a file object
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		// step 3: save the file which has our screenshot (we usually save somewhere within our project
		FileUtils.copyFile(file, new File("./src/test/resources/screenshot/login.png")); // TODO not finished
		
		tearDown();
	}

}
