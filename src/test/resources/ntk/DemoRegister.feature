Feature: Demo Register Functionality

Scenario: Verify user able to register
Given User navigates to the DemoRegister Page "https://demo.automationtesting.in/Register.html"
When User enters email "john@gmail.com" 
And User enters phone "555-4565-5555"
And User selects Gender Type "Male"
And User selects hobby "Movies"
And User selects hobby "Hockey"
And User selects hobby "Cricket"
And User Selects DOB "1990" "March" "11"
And User enters psw "John123"
And user confirms password "John123"


Scenario: Verify user able to register
Given User navigates to the DemoRegister Page "https://demo.automationtesting.in/Register.html"
When User enters email "ezra@gmail.com" 
And User enters phone "111-432-5555"
And User selects Gender Type "Male"
And User selects hobby "Movies"
And User selects hobby "Cricket"
And User Selects DOB "1990" "March" "11"
And User enters psw "John123"
And user confirms password "John123"


Scenario: Verify user able to register
Given User navigates to the DemoRegister Page "https://demo.automationtesting.in/Register.html"
When User enters email "brian@gmail.com" 
And User enters phone "434-442-5555"
And User selects Gender Type "Male"
And User selects hobby "Movies"
And User selects hobby "Hockey"
And User Selects DOB "2004" "March" "14"
And User enters psw "abc123"
And user confirms password "abc123"