Feature: Registration

  Scenario: The successful OTP validation

  Given User is on the registration page
    And User fills the valid number and email
    When User click the send OTP button
    Then User should be able to enter the Otp

    Scenario: successful redirection to the business page

      And User fill the required field
      When User clicks the submit button
      Then User should be directed to the business page