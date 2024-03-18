package com.noorteck.selenium.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recap2 {

	public static void main(String[] args) {
HashMap<String, String> s1 = new HashMap<String, String>();
		
		s1.put("FirstName", "Vladimir");
		s1.put("LastName", "F");
		s1.put("City", "Reston");
		s1.put("State", "VA");
		
		HashMap<String, String> s2 = new HashMap<String, String>();
		
		s2.put("FirstName", "Brian");
		s2.put("LastName", "P");
		s2.put("City", "NY City");
		s2.put("State", "NY");
		
		HashMap<String, String> s3 = new HashMap<String, String>();
		
		s3.put("FirstName", "Ezra");
		s3.put("LastName", "W");
		s3.put("City", "Aidie");
		s3.put("State", "VA");
		
		HashMap<String, String> s4 = new HashMap<String, String>();
		
		s4.put("FirstName", "Cindy");
		s4.put("LastName", "G");
		s4.put("City", "Ashburn");
		s4.put("State", "FL");
		
		List<HashMap<String, String>> studentList = new ArrayList<HashMap<String, String>>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		System.out.println(studentList);
		
		
	}


	}

