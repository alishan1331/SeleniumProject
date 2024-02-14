package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		setUp();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);

		WebElement firstNameField = driver.findElement(By.name("firstName"));

		firstNameField.sendKeys("Alishan");

		WebElement lastNameField = driver.findElement(By.name("lastName"));
		Thread.sleep(2000);

		lastNameField.sendKeys("Kadirov");

		WebElement phoneField = driver.findElement(By.name("phone"));
		Thread.sleep(2000);

		phoneField.sendKeys("434-220-2234");

		WebElement emailField = driver.findElement(By.id("userName"));
		Thread.sleep(2000);

		emailField.sendKeys("alishann@gmail.com");

		WebElement addressField = driver.findElement(By.name("address1"));
		Thread.sleep(2000);

		addressField.sendKeys("224 abc rd");

		WebElement cityField = driver.findElement(By.name("city"));
		Thread.sleep(2000);

		cityField.sendKeys("Reston");

		WebElement stateField = driver.findElement(By.name("state"));
		Thread.sleep(2000);

		stateField.sendKeys("Virginia");

		WebElement postalCodeField = driver.findElement(By.name("postalCode"));
		Thread.sleep(2000);

		postalCodeField.sendKeys("22901");

		WebElement userNameField = driver.findElement(By.name("email"));
		Thread.sleep(2000);

		userNameField.sendKeys("akm6");

		WebElement passwordField = driver.findElement(By.name("password"));
		Thread.sleep(2000);

		passwordField.sendKeys("B11-slnm");

		WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
		Thread.sleep(2000);
		confirmPasswordField.sendKeys("B11-slnm");

		WebElement submitField = driver.findElement(By.xpath(
				" /html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));

		submitField.click();

		WebElement confirmationmssg = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String message = confirmationmssg.getText();
		Thread.sleep(2000);

		tearDown();
	}

}
