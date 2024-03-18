Feature: Post Request

  @friday
  Scenario: Verify User able to make POST request
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA1NDI0MDMsImV4cCI6MTcxMDYyODgwM30.VyQTMpz7Px5x58u8pWR99oqXfJlhcS7t84KD4RJkMyk'
    * def endpoint = 'https://hr-sit.noortecktraining.com/employee/create'
    * def requestBody =
      """
      {
      "firstName": "Friday-B11",
      "lastName": "B11",
      "email": "example@example.com",
      "phoneNumber": "<phone_number>",
      "hireDate": "01/01/1970",
      "jobId": "AD_VP",
      "salary": 3000,
      "comissionPct": 0.1,
      "managerId": 108,
      "departmentId": 60
      }
        	
      """
    Given header Authorization = token
    And header Content-Type = 'application/json'
    And header accept = 'application/json'
    And url endpoint
    And request requestBody
    When method POST
    Then status 201
    * print response
