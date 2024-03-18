Feature: Retrieve emp
  # in karate api we can create a variable/object and set equal to a value
  @smoke
  Scenario: Verify GET Request
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA3MTQ0NjksImV4cCI6MTcxMDgwMDg2OX0.y9Z2Yrl6j6X4FluoAdemiy3S5Lw4HFjM8E15lv-dZ6g'
    * def endpoint = 'https://hr-sit.noortecktraining.com/employee/one'
    * def city = 'Reston'
    Given header Authorization = token
    And params {id: 124}
    And url endpoint
    When method GET
    Then print response
    * print city
    And status 200
    
    

  