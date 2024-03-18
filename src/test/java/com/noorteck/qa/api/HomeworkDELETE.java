package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HomeworkDELETE {

	public static void main(String[] args) {
		
		
		String endpoint = "https://hr-sit.noortecktraining.com/department/delete/30";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyNjg5MjksImV4cCI6MTcxMDM1NTMyOX0.8zfuMCjwue59FEgK-b90-_AdlvYTBgz3jOjprnfzEdw";
		
		
		
		Response response;
		
		response = given()
				.header("Authorization", token)
				.header("Accept", "application/json")
				.when()
				.delete(endpoint)
				.then()
				.extract()
				.response();
		
		// retrieve status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code:" + statusCode);
		
		// json
		
		JsonPath json = response.jsonPath();
		
		String message = json.getString("message");
		
		System.out.println("Message:"+ message);
	}
}
