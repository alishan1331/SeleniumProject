Feature: Ebay2
 Scenario Outline: Verify Userable to search for product
   Given User navigates to ebay page "<url>"
   When User enters product "<productName>"
   And User clicks search button
   Then user verifies search result
   Examples:
     | url                   | productName |
     | https://www.ebay.com/ | Java Book   |
     | https://www.ebay.com/ | Coffee      |
     | https://www.ebay.com/ | TV          |
     | https://www.ebay.com/ | Car         |


