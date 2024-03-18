package com.noorteck.qa.test;

import java.awt.Menu;

import com.noorteck.qa.pages.AdminPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;

import utils.Hooks;

public class JobTitlesTest extends Hooks{
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://ntkhr.noortecktraining.com/web/index.php/auth/login";
		String username = "ntk-admin";
		String password ="Ntk-orange!admin.123";
			
		setUp();	
		driver.get(url);
		
		//Page Class Objects
		LoginPage loginObj = new LoginPage(driver);
		MenuPage menuObj = new MenuPage(driver);
		AdminPage adminObj = new AdminPage(driver);
		JobTitlesPage jobTitlesObj = new JobTitlesPage(driver);
		
		
		//Login
		loginObj.enterUsername(username);
		loginObj.enterPassword(password);
		loginObj.clickLoginButton();
		
		
		//MenuPage
		menuObj.clickAdmin();
		
		Thread.sleep(2000);

		
		//AdminPage
		adminObj.clickJobDropdown();
		
		Thread.sleep(2000);

		
		adminObj.selectValueFromJobDropdown("Job Titles");

		
		Thread.sleep(2000);

		
		//add new job title
		jobTitlesObj.clickAddButton();
		
		jobTitlesObj.enterJobTitle("TestB11-Alishan"); //TODO CHANGE the Value inside ""
		jobTitlesObj.enterJobDesc("Alishan-Desc");
		jobTitlesObj.enterNote("Alishan-Note");
		jobTitlesObj.clickSaveButton();
		
		
		Thread.sleep(2000);
		
		
		//Edit the first job in table
		jobTitlesObj.clickPencilIcon();
		
		jobTitlesObj.enterJobTitle("TestB11-Edit-Alishan"); //TODO CHANGE the Value inside ""
		jobTitlesObj.enterJobDesc("TestB11-Edit-Alishan");
		jobTitlesObj.enterNote("TestB11-Edit-Alishan");
		jobTitlesObj.clickSaveButton();
		
		
		
		Thread.sleep(2000);

		//Delete the first job in table
		
		jobTitlesObj.clickTrashIcon();
		Thread.sleep(1000);
		jobTitlesObj.clickYesDelete();
		
		
		
		tearDown();
	}


	
	
	
	//Testcase 1: Add New Job Title
	
	
	
	//Testcase 2: Edit existing job title
	
	
	//Testcase 3: delete the job title 


		
		
	
		
		
	
		
		
	}


