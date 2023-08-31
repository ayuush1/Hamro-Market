Feature: User Registration

  Scenario: Registering a new user
    Given User is on the registration page
    When User fills the valid number and email
    Then User should be able to click register button
    And User fill the required field
    Then User clicks the submit button
    And User click the next button and confirm it


