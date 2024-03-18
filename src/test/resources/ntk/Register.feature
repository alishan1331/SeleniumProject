Feature: Verify Register Page Functionality

  Scenario: Verify User able to Register
    Given User navigates to Register Page "https://demo.guru99.com/test/newtours/register.php"
    When User enters firstname "John"
    And User enters lastName "Cena"
    And User selects country "UNITED STATES"
    And User enters credentials "Admin" "123Password"
    And User clicks submit button
