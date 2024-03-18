package com.noorteck.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void setUp() {
		System.out.println("*****************@Before Cucumber Hooks Class******************");
		
	
	}
	
	@After
	public void tearDown() {
		System.out.println("*****************@After Cucumber Hooks Class******************");
	}
	
}
