package com.noorteck.qa.api;

import io.restassured.response.Response;

// we need to import statically the given()
import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;


public class DemoGET {

	public static void main(String[] args) {
		
		// set up the environment
		String endPoint ="https://hr-sit.noortecktraining.com/employee/one";
		String id = "115";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyMDQxMTYsImV4cCI6MTcxMDI5MDUxNn0.G1LxmCZT6Tj10KdDUq7iuuc596iQMlJBM59VqeXijbA";
		
		
		// step 1. response object
		
		Response response;
		
		
		// method chaining approach --> one method calls another method, and another method calls another method...
		
		response = given()
				.queryParam("id", id)
				.header("Authorization", token)
				.when()
				.get(endPoint)
				.then()
				.extract()
				.response();
		
		
		// retrieve the status code
		
	int statusCode =	response.getStatusCode();
	
	System.out.println("Status code:"+ statusCode);
		
		// response body --> JsonPath Dependecy
	
	JsonPath jsonPath = response.jsonPath();
	
	// we need to call the getString() from JsonPath and pass the fieldName to retireve the given fieldName value
	
	String empID = jsonPath.getString("employee_id");
	String firstName =jsonPath.getString("first_name");
	String lastName = jsonPath.getString("last_name");
	String managerId =jsonPath.getString("manager_id");
		
	
	System.out.println("ID:"+ empID);
	System.out.println("FN:" + firstName);
	System.out.println("LN:" + lastName);
	System.out.println("M_ID:" + managerId);
		
	}
}
