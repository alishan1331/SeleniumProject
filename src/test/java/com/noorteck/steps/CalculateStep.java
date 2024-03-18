
package com.noorteck.steps;
import io.cucumber.java.en.Given;
public class CalculateStep {
	@Given("User provides numbers for addition {string} {string}")
	public void user_provides_numbers_for_addition(String num1, String num2) {
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int result = n1 + n2;
		
		System.out.println(n1 + " + " +  n2 + " = " + result);
	}
	@Given("User provides numbers for subtraction {string} {string}")
	public void user_provides_numbers_for_subtraction(String num1, String num2) {
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int result = n1 - n2;
		
		System.out.println(n1 + " - " +  n2 + " = " + result);
	}
	@Given("User provides numbers for multiplication {string} {string}")
	public void user_provides_numbers_for_multiplication(String num1, String num2) {
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int result = n1 * n2;
		
		System.out.println(n1 + " * " +  n2 + " = " + result);
	}
}
