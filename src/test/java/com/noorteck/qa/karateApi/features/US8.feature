
Feature: Department API
	@dept
  Scenario Outline: Verify user is able to make a POST for department
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA2OTY3OTEsImV4cCI6MTcxMDc4MzE5MX0.ImkQOfLCXAYqnFApg7d9NqmjGHUUBPCs30xvuBIGcbY'
    * def endpoint = 'https://hr-sit.noortecktraining.com/department/create'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/DepRequestBody.json')
    * print requestBody
    * set requestBody.departmentName = <department_name>
    * set requestBody.managerId = <manager_id>
    * set requestBody.locationId = <location_id>
    Given header authorization = token
    And header content-Type = 'Application/json'
    And header accept = 'application/json'
    And url endpoint
    And request requestBody
    When method POST
    Then status 201
    * print response

    Examples: 
      | department_name | manager_id | location_id |
      | "SDET_BMW"      |        108 |        1000 |

  ############################################################
  @dept
  Scenario Outline: Verify user can GET department
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA2OTY3OTEsImV4cCI6MTcxMDc4MzE5MX0.ImkQOfLCXAYqnFApg7d9NqmjGHUUBPCs30xvuBIGcbY'
    * def endpoint = 'https://hr-sit.noortecktraining.com/department/'
    Given header Authorization = token
    And header accept = 'application/json'
    And path <id>
    And url endpoint
    When method GET
    Then status 200
    * print response

    Examples: 
      | id  |
      | 627 |

  ###############################################################
  @dept
  Scenario Outline: Verify user can update department (PUT)
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA2OTY3OTEsImV4cCI6MTcxMDc4MzE5MX0.ImkQOfLCXAYqnFApg7d9NqmjGHUUBPCs30xvuBIGcbY'
    * def endpoint = 'https://hr-sit.noortecktraining.com/department/update'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/DepRequestBody.json')
    * print requestBody
    * set requestBody.departmentId = <department_id>
    * set requestBody.departmentName = <department_name>
    * set requestBody.managerId = <manager_id>
    * set requestBody.locationId = <location_id>
    Given header Authorization = token
    And header content-Type = 'Application/json'
    And header accept = 'Application/json'
    And url endpoint
    And request requestBody
    When method PUT
    Then status 200
    * print response

    Examples: 
      | department_id | department_name | manager_id | location_id |
      |           627 | "SDET_BMW"      |        108 |        1000 |

  ###################################################################
  
  Scenario Outline: verify user can update certain part (PATCH)
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA2OTY3OTEsImV4cCI6MTcxMDc4MzE5MX0.ImkQOfLCXAYqnFApg7d9NqmjGHUUBPCs30xvuBIGcbY'
    * def endpoint = 'https://hr-sit.noortecktraining.com/department/update-name'
    * def requestBody = read('classpath:com/noorteck/qa/karateApi/data/DepRequestBody.json')
    * print requestBody
    * set requestBody.departmentId = <dep_id>
    * set requestBody.departmentName = <dep_name>
    Given header Authorization = token
    And header Content-Type = 'Application/json'
    And header accept = 'Application/json'
    And url endpoint
    And request requestBody
    When method PATCH
    Then status 200
    * print response

    Examples: 
      | dep_id | dep_name      |
      |    627 | "SDET_BMW123" |

  ############################################################################
  Scenario Outline: verify user can DELETE
    * def token = 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjIsInVzZXJuYW1lIjoiZ3Vlc3QiLCJpYXQiOjE3MTA2OTY3OTEsImV4cCI6MTcxMDc4MzE5MX0.ImkQOfLCXAYqnFApg7d9NqmjGHUUBPCs30xvuBIGcbY'
    * def endpoint = 'https://hr-sit.noortecktraining.com/department/delete/617'
    Given header Authorization = token
    And header accept = 'Authorization/json'
    And url endpoint
    And path <id>
    When method DELETE
    Then status 200
    * print response

    Examples: 
      | id  |
      | 627 |
