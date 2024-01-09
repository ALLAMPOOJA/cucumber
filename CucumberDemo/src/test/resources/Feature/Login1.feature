Feature: feature to check login funtionality

  Scenario: login successful with valid credentials
    Given user is on login page
    When user enter valid username and password
    And clicks on login button
    Then user is navigated to home page
