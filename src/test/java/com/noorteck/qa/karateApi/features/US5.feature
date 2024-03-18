Feature: Post Request

  @january
  Scenario: Reading request body from json file
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA1NDI0MDMsImV4cCI6MTcxMDYyODgwM30.VyQTMpz7Px5x58u8pWR99oqXfJlhcS7t84KD4RJkMyk'
    * def endpoint = 'https://hr-sit.noortecktraining.com/employee/create'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/EmpRequestBody.json')
    * print requestBody
    Given header Authorization = token
    And header Content-Type = 'application/json'
    And header accept = 'application/json'
    And url endpoint
    And request requestBody
    When method POST
    Then status 201
    * print response
