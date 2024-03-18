package com.noorteck.qa.karateApi.runner;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@RunWith(Karate.class)

@KarateOptions	(features = "classpath:com/noorteck/qa/karateApi/features/",
						tags = "@javamethod")



public class ApiRunner {

}
