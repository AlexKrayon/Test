Feature:  User on the web page

  @FLT-1854 @Ac_1
  Scenario: The user can log out and ends up on the login page.
    Given User is on the XFleet Login page
    When user enters the userName
    And user enters the password
    And user clicks the login button
    Then user should be able to see the Quick Launchpad in the home page
    When user clicks the profile button
    And user clicks the logout button
    Then user should be able to see login header


  @FLT-1855 @Ac_2

  Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out.
    Given User is on the XFleet Login page
    When user enters the userName
    And user enters the password
    And user clicks the login button
    Then user should be able to see the Quick Launchpad in the home page
    When user clicks the profile button
    And user clicks the logout button
    Then user should be able to see login header
    When user clicks the step back button
    Then user should be able to see login header

  @FLT-1856 @Ac_3

  Scenario:  The user must be logged out if the user close the open tab (all tabs if there are multiple open tabs)

    Given User is on the XFleet Login page
    When user enters the userName
    And user enters the password
    And user clicks the login button
    Then user should be able to see the Quick Launchpad in the home page
    And user should close the tab
    And user open the same page for home page
    Then user should be able to see login header









