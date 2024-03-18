package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DemoDELETE {
	public static void main(String[] args) {
		
		String endpoint = "https://hr-sit.noortecktraining.com/employee/delete/4578";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyMDU4NDgsImV4cCI6MTcxMDI5MjI0OH0.C0jxICCD-GE5ZtqTfpYJR_a_hAZD09Glb22uXTTKtdk";
		
		// response object
		
		Response response;
		
		
		response = given()
				.header("Authorization", token)
				.header("Accept","Application/json")
				.when()
				.delete(endpoint)
				.then()
				.extract()
				.response();
		
		
		// retrieve status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code:" + statusCode);
		
		// response body --> jsonPath dependecy
		
		JsonPath json = response.jsonPath();
			
		String message = json.getString("message");
		
		System.out.println("Message:"+ message);
		
	}

}
