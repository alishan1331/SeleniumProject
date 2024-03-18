Feature: Post Request

  @feb
  Scenario Outline: Verify User able to make POST request
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA1NDI0MDMsImV4cCI6MTcxMDYyODgwM30.VyQTMpz7Px5x58u8pWR99oqXfJlhcS7t84KD4RJkMyk'
    * def endpoint = 'https://hr-sit.noortecktraining.com/employee/create'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/EmpRequestBody.json')
    * print requestBody
    * set requestBody.firstName = <first_name>
    * set requestBody.lastName = <last_name>
    * set requestBody.email = <email>
    * set requestBody.phoneNumber = <phone_number>
    * set requestBody.hireDate = <hire_date>
    * set requestBody.jobId = <job_id>
    * set requestBody.salary = <salary>
    * set requestBody.comissionPct = <comission>
    * set requestBody.managerId = <manager_id>
    * set requestBody.departmentId = <department_id>
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
      | "Alishan"  | "K"       | "alishan@gmail.com" | "222-222-2525" | "01/01/2010" | "AD_VP" |   3333 |       0.1 |        108 |            70 |
