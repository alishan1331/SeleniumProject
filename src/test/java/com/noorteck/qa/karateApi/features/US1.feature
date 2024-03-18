Feature: Retrieve emp

  
  Scenario: verify GET request
    Given header Authorization = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA3MTQ0NjksImV4cCI6MTcxMDgwMDg2OX0.y9Z2Yrl6j6X4FluoAdemiy3S5Lw4HFjM8E15lv-dZ6g'
    And params {id: 124}
    And url 'https://hr-sit.noortecktraining.com/employee/one'
    When method GET
    Then print response
    And status 200

    
