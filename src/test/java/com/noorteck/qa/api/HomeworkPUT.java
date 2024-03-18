package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HomeworkPUT {

	public static void main(String[] args) {
		
		
		String endpoint = "https://hr-sit.noortecktraining.com/department/update";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyNjg5MjksImV4cCI6MTcxMDM1NTMyOX0.8zfuMCjwue59FEgK-b90-_AdlvYTBgz3jOjprnfzEdw";
		
		String requestBody = "{\r\n"
				+ "  \"departmentId\": 397,\r\n"
				+ "  \"departmentName\": \"QA_SDET4LIFE\",\r\n"
				+ "  \"managerId\": 200,\r\n"
				+ "  \"locationId\": 1700\r\n"
				+ "}";
		
		// create response object
		
		Response response;
		
		response = given()
					.header("Authorization", token)
					.header("Accept","application/json")
					.header("Content-Type","application/json")
					.body(requestBody)
					.when()
					.put(endpoint)
					.then()
					.extract()
					.response();
		
		// find status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status code:" + statusCode);
		
		// json
		
		JsonPath json = response.jsonPath();
		
		String message = json.getString("message");
		
		response.prettyPrint();
		
		System.out.println("StatusCode:" + statusCode);
		
		System.out.println("Message:"+ message);
		
		
	}
}
