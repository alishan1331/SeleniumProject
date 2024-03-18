package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PracticeGET {

	public static void main(String[] args) {
		
		
		String endpoint = "https://hr-sit.noortecktraining.com/employee/one";
		String id = "107";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyNDQ0NTYsImV4cCI6MTcxMDMzMDg1Nn0._i9rdbPJHC1s4cVx2pYHz77oIXh4S_-saeaG02RzXBg";
		
		
		// response object
		
		Response response;
		
		response = given()
				.queryParam("id", id)
				.header("Authorization", token)
				.when()
				.get(endpoint)
				.then()
				.extract()
				.response();
		
		// retrieve the status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code:"+statusCode);
		
		
		// response body 
		
		JsonPath json = response.jsonPath();
		
		String empID = json.getString("employee_id");
		String firstName = json.getString("first_name");
		
		System.out.println("ID:"+ empID);
		System.out.println("FN:"+ firstName);
		
		
		System.out.println("**************");
		response.prettyPrint();
		System.out.println("**************");

		
	}
}
