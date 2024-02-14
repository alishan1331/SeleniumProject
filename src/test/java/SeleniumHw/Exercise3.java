package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exercise3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.name("Gender"));
		Thread.sleep(2000);
		gender.click();

		WebElement firstNameField = driver.findElement(By.id("FirstName"));
		Thread.sleep(2000);
		firstNameField.sendKeys("Alishan");

		WebElement lastNameField = driver.findElement(By.id("LastName"));
		Thread.sleep(2000);
		lastNameField.sendKeys("K");

		WebElement DOBScroll = driver.findElement(By.name("DateOfBirthDay"));
		Thread.sleep(2000);
		Select selectObj = new Select(DOBScroll);

		selectObj.selectByVisibleText("31");

		WebElement MonthScroll = driver.findElement(By.name("DateOfBirthMonth"));
		Thread.sleep(2000);
		Select selectObj1 = new Select(MonthScroll);

		selectObj1.selectByVisibleText("January");

		WebElement yearScroll = driver.findElement(By.name("DateOfBirthYear"));
		Thread.sleep(2000);
		Select selectObj2 = new Select(yearScroll);

		selectObj2.selectByVisibleText("2003");

		WebElement emailField = driver.findElement(By.id("Email"));
		Thread.sleep(2000);

		emailField.sendKeys("alishannkad1@gmail.com");

		WebElement companyNameField = driver.findElement(By.name("Company"));
		Thread.sleep(2000);
		companyNameField.sendKeys("NoorTeck");

		WebElement checkBox = driver.findElement(By.id("Newsletter"));
		Thread.sleep(2000);
		checkBox.click();

		WebElement passwordField = driver.findElement(By.id("Password"));
		Thread.sleep(2000);
		passwordField.sendKeys("abc123");

		WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
		Thread.sleep(2000);
		confirmPassword.sendKeys("abc123");
		WebElement registerBtn = driver.findElement(By.name("register-button"));
		Thread.sleep(2000);
		registerBtn.click();

		WebElement confirmMsg = driver.findElement(By.xpath(" /html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String mssg = confirmMsg.getText();

		if (mssg.contains("Your registraion completed")) {
			System.out.println("TEST CASE PASSED");
		} else {
			System.out.println("TEST CASE FAILED");
		}

		tearDown();
	}

}
