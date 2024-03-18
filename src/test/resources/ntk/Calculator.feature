Feature: Calculate
 Scenario Outline: Calcualte numbers
   Given User provides numbers for addition "<num1>" "<num2>"
   And User provides numbers for subtraction "<num1>" "<num2>"
   And User provides numbers for multiplication "<num1>" "<num2>"
   Examples:
     | num1 | num2 |
     |    2 |    1 |
     |   44 |   22 |
     |   33 |   11 |
