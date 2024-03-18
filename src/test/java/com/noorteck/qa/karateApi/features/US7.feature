Feature: Post Request for Job

  @march
  Scenario Outline: Verify user is able to make a POST request for Job
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA3Nzg0NTQsImV4cCI6MTcxMDg2NDg1NH0.mN_bTkA5wKNKcU5H0vqrf2UbccF_JT4aU3P5P5z06fs'
    * def endpoint = 'https://hr-sit.noortecktraining.com/job/create'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/JobRequestBody.json')
    * print requestBody
    * set requestBody.jobId = <job_id>
    * set requestBody.jobTitle = <job_title>
    * set requestBody.minSalary = <min_salary>
    * set requestBody.maxSalary = <max_salary>
    Given header Authorization = token
    And header Content-Type = 'Application/json'
    And header accept = 'application/json'
    And url endpoint
    And request requestBody
    When method POST
    Then status 200
    * print response

    Examples: 
      | job_id    | job_title | min_salary | max_salary |
      | "B11_12345" | "SDET"    |        300 |        400 |
