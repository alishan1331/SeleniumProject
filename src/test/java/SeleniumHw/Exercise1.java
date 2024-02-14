package SeleniumHw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(2000);

		WebElement userField = driver.findElement(By.name("username"));
		Thread.sleep(2000);

		userField.sendKeys("ntk-admin");

		WebElement passwordField = driver.findElement(By.name("password"));
		Thread.sleep(2000);

		passwordField.sendKeys("Ntk-orange!admin.123");

		WebElement loginField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Thread.sleep(2000);

		loginField.click();

		tearDown();
	}

}
