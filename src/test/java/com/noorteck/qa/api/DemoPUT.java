package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DemoPUT {

	public static void main(String[] args) {
		
		
		String endpoint = "https://hr-sit.noortecktraining.com/employee/update";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyMDU4NDgsImV4cCI6MTcxMDI5MjI0OH0.C0jxICCD-GE5ZtqTfpYJR_a_hAZD09Glb22uXTTKtdk";
		
		String requestBody = "{\r\n"
				+ "  \"employeeId\": 4551,\r\n"
				+ "  \"firstName\": \"John\",\r\n"
				+ "  \"lastName\": \"Doe\",\r\n"
				+ "  \"email\": \"example@example.com\",\r\n"
				+ "  \"phoneNumber\": \"<phone_number>\",\r\n"
				+ "  \"hireDate\": \"01/01/1970\",\r\n"
				+ "  \"jobId\": \"AD_VP\",\r\n"
				+ "  \"salary\": 3000,\r\n"
				+ "  \"comissionPct\": 0.1,\r\n"
				+ "  \"managerId\": 108,\r\n"
				+ "  \"departmentId\": 80\r\n"
				+ "}";
		
		// response object
		
		Response response;
		
		response = given()
				.header("Accept", "application/json")
				.header("Authorization", token)
				.header("Content-Type", "application/json")
				.body(requestBody)
				.when()
				.put(endpoint)
				.then()
				.extract()
				.response();
		
		int statusCode = response.getStatusCode();
		
		JsonPath json = response.jsonPath();
		
		String message = json.getString("Message");
		
		response.prettyPrint();
		
		System.out.println("StatusCode:" +statusCode);
		
	}
}
