package com.noorteck.qa.api;


import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HomeworkPOST {

	public static void main(String[] args) {
		
		String endpoint = "https://hr-sit.noortecktraining.com/department/create";
		String token = " Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyNjg5MjksImV4cCI6MTcxMDM1NTMyOX0.8zfuMCjwue59FEgK-b90-_AdlvYTBgz3jOjprnfzEdw";
		
		String requestBody = "{\r\n"
				+ "  \"departmentName\": \"SDET-B11-123\",\r\n"
				+ "  \"managerId\": 200,\r\n"
				+ "  \"locationId\": 1700\r\n"
				+ "}";
		
		
		// create a response object
		Response response;
		
		response = given()
					.header("Authorization", token)
					.header("Accept", "Application/json")
					.header("Content-Type","Application/json")
					.body(requestBody)
				   .when()
				   .post(endpoint)
				   .then()
				   	.extract()
				   	.response();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code:" + statusCode);
		
		response.prettyPrint();
		
		
		// create json
		JsonPath json = response.jsonPath();
		
		String message = json.getString("message");
		String deptID = json.getString("departmentId");
		
		System.out.println("Message:" + message);
		System.out.println("DeptID:"+ deptID);
		
	}
}
