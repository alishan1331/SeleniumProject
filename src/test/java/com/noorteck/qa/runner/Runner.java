package com.noorteck.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/ntk/",
		glue = "com.noorteck.steps",
		tags = "@SmokeTest or @coffeeTest",
		plugin = {"pretty",
				"html:target/cucumber-report.html"
				},
		monochrome = true
		
		)

public class Runner {

}
