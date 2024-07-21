Feature: Test Cogmento CRM Application

  Scenario: Validate Login Page Functionality
    Given user is on login page
    When user enter valid credentails
    Then user click on login button

  Scenario: validate home page Functionality
    When user is on home page and validate title
    
     Scenario: validate home url Functionality
    When user is on home page and validate url
