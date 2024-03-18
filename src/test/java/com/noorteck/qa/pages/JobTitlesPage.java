package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage {


	@FindBy(xpath = "//h6[text()='Job Titles']")
	WebElement jobTitleHeader;

	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement addButton;

	@FindBy(xpath = "(//*[@class='oxd-icon bi-trash'])[1]")
	WebElement trashIcon;

	@FindBy(xpath = "(//*[@class='oxd-icon bi-pencil-fill'])[1]")
	WebElement pencilIcon;

	@FindBy(xpath = "//*[text()='Add Job Title']")
	WebElement addJobTitleHeader;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement jobTitlesField;

	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	WebElement jobDescField;

	@FindBy(xpath = "//textarea[@placeholder='Add note']")
	WebElement addNoteField;

	@FindBy(xpath = "//button[text()=' Cancel ']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement saveButton;
	
	@FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement yesDeleteConfirm;

	public JobTitlesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickYesDelete() {
		yesDeleteConfirm.click();
	}
	
	public String getJobTitleHeader() {
		String result = "";
		
		result = jobTitleHeader.getText();
		
		return result;
	}
	
	public String getAddJobTitleHeader() {
		String result = "";
		
		result = addJobTitleHeader.getText();
		
		return result;
	}
	
	public void clickAddButton() {
		addButton.click();
	}

	public void clickTrashIcon() {
		trashIcon.click();
	}
	
	public void clickPencilIcon() {
		pencilIcon.click();
	}
	
	public void clickSaveButton() {
		saveButton.click();
	
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	
	
	public void enterJobTitle(String jobTitle) {
		jobTitlesField.clear();
		jobTitlesField.sendKeys(jobTitle);
	}
	
	public void enterJobDesc(String jobDesc) {
		jobDescField.clear();

		jobDescField.sendKeys(jobDesc);
	}
	
	
	public void enterNote(String note) {
		addNoteField.clear();

		addNoteField.sendKeys(note);
	}

}

