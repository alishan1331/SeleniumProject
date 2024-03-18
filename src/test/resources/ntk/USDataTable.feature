Feature: Datatable example
 Scenario: Demo datatable
   Given User navigates to ebay page "https://www.ebay.com/"
   When User search  for product
     | productName |
     | Java Book   |
     | Coffee      |
     | TV          |
     | Car         |
   Then user verifies search result
