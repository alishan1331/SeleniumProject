package PracticeSelenium;


import org.testng.annotations.BeforeClass;

import utils.Hooks;

public class Practice6 extends Hooks{
	
	public static void main(String[] args) {
		
		
		setUp();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		String getTitle = driver.getTitle();
		
		if(getTitle.equals("Alerts")) {
			System.out.println("Passed");
		}else {
			System.out.println("Not Passed");
			
			
			 
			
		}
		
		
		
		
		
		
		
		
		
		tearDown();
	}


}
