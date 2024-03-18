package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Practice5 extends Hooks {

	public static void main(String[] args) {

		setUp();

		driver.get("https://blazedemo.com/index.php");

		// drop down
		WebElement departCityDropDown = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select city = new Select(departCityDropDown);
		city.selectByVisibleText("Boston");

		// drop down
		WebElement destinationCityDropDown = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select city1 = new Select(destinationCityDropDown);
		city1.selectByVisibleText("Rome");

		// verify page title

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("BlazeDemo - reserve")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not Verified");
			
			WebElement chooseFlightList = driver.findElement(By.xpath("//input[@value='Choose This Flight']"));
			
			List<WebElement> flightList = chooseFlightList.getOptions();

			tearDown();
		}

	}
}
