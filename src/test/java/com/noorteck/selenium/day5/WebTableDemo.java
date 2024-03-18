package com.noorteck.selenium.day5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class WebTableDemo extends Hooks{

	public static void main(String[] args) {
		setUp();
		driver.get("https://testautomationpractice.blogspot.com/");

		// Step 1. Find out how many rows we have in the table
		// Number of rows will include both the table header and the table data)
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

		// Step 2. Find out how many columns we have in teh table
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']//th"));

		
		//Find out the size of row & column	
		int rowSize = rowList.size();
		int columnSize =  columnList.size();
		
		
		System.out.println("Row#:    " + rowSize);
		System.out.println("Column#: " + columnSize);
		
		
		List<LinkedHashMap<String, String>> rowMapList = new ArrayList<LinkedHashMap<String,String>>();
		
		
		//Loop 1. OUTTER LOOP --> will be for ROW_DATA(which row # the data starts from ???? ROW 2	
		for(int row = 2; row <= rowSize; row++) {	
		
		//	System.out.println("*****************");
			
			//Individual Map -->  1 Map per ROW	
			LinkedHashMap<String, String> rowMap = new LinkedHashMap<String, String>();
			

			//Loop 2. INNER LOOP --> will be for the columnName	
			for(int column = 1; column <= columnSize; column++) {
				
		
				
				//work happens in heree...
						
				//1A. write an xpath that will capture the column Element 		
				WebElement columnNameElement = driver.findElement(By.xpath("//table[@name='BookTable']//th["+column+"]"));
				//1b. retrieve teh column name
				String columnName = columnNameElement.getText();
				
				
				//2A. write an xpath that will capture the columnValueElement
				WebElement columnValueElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));		
				//2B. retreive the columnValue text
				String columnValue = columnValueElement.getText();
					
			//	System.out.println(columnName + " : " + columnValue);
				
				//we need to add the columName(K) and columnValue(V) to the map
				
				rowMap.put(columnName, columnValue);
				
			}
			
			rowMapList.add(rowMap);
		//	System.out.println("*****************");
		}

		System.out.println(rowMapList);
		tearDown();
	
	
	
	// verify if animesh is teaching JavaScript subject
	
	for(int i = 0; i < rowMapList.size(); i++) {
		
		LinkedHashMap<String, String> map = rowMapList.get(i);
		if(map.get("Author").equals("Animesh")) {
			if(map.get("Subject").equals("Javascript")) {
				System.out.println("validation passed: Subject is JS");
			}else {
				System.out.println("Validation Failed: Subject is not JS");
			}
		}
	}
		
	}
}