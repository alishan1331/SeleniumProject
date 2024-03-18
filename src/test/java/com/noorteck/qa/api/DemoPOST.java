package com.noorteck.qa.api;


import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class DemoPOST {




	public static void main(String[] args) {
		
		String endpoint = "https://hr-sit.noortecktraining.com/employee/create";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyMDU4NDgsImV4cCI6MTcxMDI5MjI0OH0.C0jxICCD-GE5ZtqTfpYJR_a_hAZD09Glb22uXTTKtdk";
		
		String requestBody = "{\r\n"
				+ "  \"firstName\": \"John II\",\r\n"
				+ "  \"lastName\": \"CENA\",\r\n"
				+ "  \"email\": \"example@example.com\",\r\n"
				+ "  \"phoneNumber\": \"<phone_number>\",\r\n"
				+ "  \"hireDate\": \"01/01/1970\",\r\n"
				+ "  \"jobId\": \"AD_VP\",\r\n"
				+ "  \"salary\": 3000,\r\n"
				+ "  \"comissionPct\": 0.1,\r\n"
				+ "  \"managerId\": 108,\r\n"
				+ "  \"departmentId\": 100\r\n"
				+ "}";
		
		// response object
		
		Response response;
		
		response = given()
				.header("Authorization",token)
				.header("Content-Type","Application/json")
				.header("Accept","application/json")
				.body(requestBody)
				.when()
				.post(endpoint)
				.then()
				.extract()
				.response();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("StatusCode:" + statusCode);
		
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		
		String id = jsonPath.getString("id");
		String message = jsonPath.getString("Message");
		
		System.out.println("ID:" + id);
		System.out.println("Message:" + message);
		
		System.out.println("********************");
		response.prettyPrint();
		System.out.println("*****************");
		
		
		
	}
}
