package com.noorteck.qa.api;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class HomeworkGET {

	public static void main(String[] args) {
		
		
		String endpoint = "https://hr-sit.noortecktraining.com/department";
		String id = "397";
		String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTAyNjg5MjksImV4cCI6MTcxMDM1NTMyOX0.8zfuMCjwue59FEgK-b90-_AdlvYTBgz3jOjprnfzEdw";
		
		// response object
		
		Response response;
		
		// method chaining
		
		response = given()
					.queryParam("id", id)
					.header("Authorization", token)
					.header("Accept", "Application/json")
					.when()
					.get(endpoint)
					.then()
					.extract()
					.response();
		
		// retrieve the status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code:" + statusCode);
		
		// get json path
		
		JsonPath json = response.jsonPath();
		
		String deptID = json.getString("department_id");
		String deptName = json.getString("department_name");
		String mngrID = json.getString("manager_id");
		String locID = json.getString("location_id");
		
		
		System.out.println("ID:" + deptID);
		System.out.println("Department ID:" + deptName);
		System.out.println("ManagerID:" + mngrID);
		System.out.println("LocationID:"+ locID);
		
	}
}
