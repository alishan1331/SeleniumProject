Feature: Ebay

  @SmokeTest
  Scenario: Verify Userable to search for product
    Given User navigates to ebay page "https://www.ebay.com/"
    When User enters product "Java Book"
    And User clicks search button
    Then user verifies search result

  @coffeeTest
  Scenario: Verify Userable to search for product
    Given User navigates to ebay page "https://www.ebay.com/"
    When User enters product "Coffee"
    And User clicks search button
    Then user verifies search result

  Scenario: Verify Userable to search for product
    Given User navigates to ebay page "https://www.ebay.com/"
    When User enters product "TV"
    And User clicks search button
    Then user verifies search result

  Scenario: Verify Userable to search for product
    Given User navigates to ebay page "https://www.ebay.com/"
    When User enters product "Car"
    And User clicks search button
    Then user verifies search result
