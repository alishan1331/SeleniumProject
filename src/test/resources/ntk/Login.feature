Feature: Verify Login Page Functionality

  Scenario: Verify User is able to login with correct credential
    Given User navigates to login page "https://ntkhr.noortecktraining.com/web/index.php/auth/login"
    When user enters username "ntk-admin"
    And user enters Password "Ntk-orange!admin.123"
    And user click login button
    Then System redirects to dashboard page "Dashboard"
