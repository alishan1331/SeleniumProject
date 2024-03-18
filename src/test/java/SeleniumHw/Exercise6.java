package SeleniumHw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise6 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		// navigate to the link
		driver.get("https://demo.automationtesting.in/Alerts.html");

		// verify page title is alerts

		// click alert with textBox
		WebElement AlertTextBox = driver.findElement(By.linkText("Alert with Textbox"));
		AlertTextBox.click();
		Thread.sleep(2000);

		// click the button to demonstrate the prompt box
		WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		clickBtn.click();
		Thread.sleep(2000);

		// enter name in alert text field
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Alishan");
		alert.accept();
		Thread.sleep(2000);

		// verify message is shown "how are you today"
		WebElement verifyMsg = driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
		String mssg = verifyMsg.getText();
		Thread.sleep(2000);
		if (mssg.contains("How are you today")) {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("Test Case Failed");
		}

		// refresh page
		WebElement refresh = driver.findElement(By.tagName("body"));
		refresh.sendKeys(Keys.F5);
		Thread.sleep(2000);

		// click allert with ok & cancel

		WebElement alertOk = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alertOk.click();
		Thread.sleep(2000);

		// click the button to display an alert box

		WebElement displayAlertBox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		displayAlertBox.click();

		Alert alerts = driver.switchTo().alert();
		String alertbx = alerts.getText();
		if (alertbx.equals("Press a Button !")) {
			alerts.dismiss();
		} else {
			alerts.accept();
		}
			alerts.getText();
		Thread.sleep(2000);
		tearDown();
	}

}
