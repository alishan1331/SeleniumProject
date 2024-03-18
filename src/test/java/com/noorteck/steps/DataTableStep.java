package com.noorteck.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.pages.EbayPage;

import io.cucumber.java.en.When;
import utils.Hooks;

public class DataTableStep extends Hooks {
	
	@When("User search  for product")
	public void user_search_for_product(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
		 EbayPage ebayObj = new EbayPage(driver);
		
		List<Map<String,String>> listMap = dataTable.asMaps();
		
		for(Map<String,String> map : listMap) {
			
			System.out.println(map);
			
			//System.out.println(map.get("productName"));
			
			
			ebayObj.enterSearchValue(map.get("productName"));
			Thread.sleep(2000);
			
			ebayObj.clickSearchButton();
			Thread.sleep(2000);
		}
	  
	}


}
