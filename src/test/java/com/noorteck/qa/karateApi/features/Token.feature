Feature: Generate Token

  @getToken
  Scenario: Generate bearer-token
    * def baseURL = 'https://hr-sit.noortecktraining.com'
    * def requestBody =
      """
      {
       "username": "guest",
       "password": "12345678"
      	}
      """
    And header Content-Type = 'application/json'
    And header accept = 'application/json'
    And url baseURL
    And path '/auth/sign-in'
    And request requestBody
    When method POST
    * def token = 'Bearer ' + response.token
    * print token
    * print response
    * print response.token
    * print response.message
