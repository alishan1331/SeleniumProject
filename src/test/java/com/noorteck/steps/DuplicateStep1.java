package com.noorteck.steps;
import io.cucumber.java.en.Given;
public class DuplicateStep1 {
	
	@Given("calculates two numbers {string} {string}")
	public void calculates_two_numbers(String n1, String n2) {
		System.out.println("DuplicateStep1 CLASS");
	  System.out.println(n1);
	  System.out.println(n2);
	}
}

