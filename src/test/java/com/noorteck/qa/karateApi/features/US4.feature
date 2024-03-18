Feature: Post Request

  @saturday
  Scenario Outline: Verify User able to make POST request
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA1NDI0MDMsImV4cCI6MTcxMDYyODgwM30.VyQTMpz7Px5x58u8pWR99oqXfJlhcS7t84KD4RJkMyk'
    * def endpoint = 'https://hr-sit.noortecktraining.com/employee/create'
    * def requestBody =
      """
      {
      "firstName":<first_name> ,
      "lastName": <last_name> ,
      "email": <email>,
      "phoneNumber": <phone_number>,
      "hireDate": <hire_date>,
      "jobId": <job_id>,
      "salary": <salary>,
      "comissionPct": <comission>,
      "managerId": <manager_id>,
      "departmentId":<department_id>
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

    Examples: 
      | first_name | last_name | email               | phone_number   | hire_date    | job_id  | salary | comission | manager_id | department_id |
      | "Ahmed"    | "Ali"     | "ahmed@gmail.com"   | "123-222-2525" | "01/01/2020" | "AD_VP" |   2222 |       0.1 |        108 |            60 |
      | "Alishan"  | "K"       | "alishan@gmail.com" | "222-222-2525" | "01/01/2010" | "AD_VP" |   3333 |       0.1 |        108 |            70 |
      | "Brian"    | "P"       | "brian@gmail.com"   | "123-123-2525" | "01/01/2000" | "AD_VP" |   4444 |       0.1 |        108 |            80 |
