Feature: Cydeo login

  @cydeo
  Scenario: User will login the cydeo page
    Given User is on the home page
    When User clicks login button
    And User enters email
    And user enters pw
    Then user should see the cydeo main page