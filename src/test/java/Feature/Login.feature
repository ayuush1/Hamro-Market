Feature: login system

  Scenario Outline: the user should be able to login to the system

    Given user is on login page
    And user fill the "<username>" and "<pass>"
    When user click the login button
    Then the user should be directed to the dashboard

    Examples:
     | username | pass |
    | ayush   |   ayush  |
    |avyudaya | avyudaya |


