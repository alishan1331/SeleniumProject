Feature: Department API

  Background: 
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA3MTQ4MDksImV4cCI6MTcxMDgwMTIwOX0.lRVivGPM8nOJY1cstKw59vc2bB3x2Clfv9cEyQhm83k'
    * def baseURL = 'https://hr-sit.noortecktraining.com'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/DeptRequestBody.json')
    Given header Authorization = token
    And header accept = 'application/json'
    And url baseURL

  #Create new Dept
  @dept1
  Scenario Outline: Verify User able to create new Department
    * set requestBody.departmentName = <dept_name>
    * set requestBody.managerId = <manager_id>
    * set requestBody.locationId = <location_id>
    And header Content-Type = 'application/json'
    And path '/department/create'
    And request requestBody
    When method POST
    Then status 201
    * print response

    Examples: 
      | dept_name  | manager_id | location_id |
      | "Auto-B12" |        108 |        1000 |

  #Retrieve Dept
  @dept1
  Scenario Outline: Verify User able to retrieve Department
    And path '/department/'+ <id>
    When method GET
    Then status 200
    * print response

    Examples: 
      | id  |
      | 512 |

  #Update Dept
  @dept1
  Scenario Outline: Verify User able to update Department
    * set requestBody.departmentName = <dept_name>
    * set requestBody.managerId = <manager_id>
    * set requestBody.locationId = <location_id>
    * set requestBody.departmentId = <dept_id>
    * print requestBody
    And path '/department/update'
    And request requestBody
    When method PUT
    Then status 200
    * print response

    Examples: 
      | dept_name  | manager_id | location_id | dept_id |
      | "Auto-B12" |        108 |        1000 |     512 |

  #Delete Dept
  @dept1
  Scenario Outline: Verify User able to delete Department
    And path '/department/delete/'+ <id>
    When method DELETE
    Then status 200
    * print response

    Examples: 
      | id  |
      | 512 |
