Feature: User log in the website


  Background:
    Given  User is on the XFleet Login page

  @FLT-1845 @Login
  Scenario Outline:All users can log in with valid credentials (We have 3 types of users such as sales manager, store manager, truck driver).
  - Driver should land on the "Quick Launchpad" page after successful login
  - Sales Manager/ Store Manager should land on the "Dashboard" page after successful login


    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks login button
    Then User sees "<homePage>"

    Examples:
      | username        | password    | homePage        |
      | user1           | UserUser123 | Quick Launchpad |
      | storemanager51  | UserUser123 | Dashboard       |
      | salesmanager127 | UserUser123 | Dashboard       |

  @FLT-1846 @Login
  Scenario Outline:User should be able to see "Invalid username or password."

    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks login button
    Then User sees the alert of "<InvalidAlert>"


    Examples: search values will be as below listed


      | username        | password    | InvalidAlert                   |
      | user1           | UserUser    | Invalid user name or password. |
      | storemanager91  | kkailgr     | Invalid user name or password. |
      | salesmanager114 | 11049582    | Invalid user name or password. |
      | user2000        | UserUser123 | Invalid user name or password. |
      | storemanager111 | UserUser123 | Invalid user name or password. |
      | salesmanager199 | UserUser123 | Invalid user name or password. |


  @FLT-1847 @Login
  Scenario Outline:"Please fill out this field" message should be displayed if the password or username is empty

    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks login button
    Then user sees the message of "<FilloutTheField>"


    Examples:
      | username        | password    | FilloutTheField |
      | user11          |             | FilloutTheField |
      | storemanager83  |             | FilloutTheField |
      | salesmanager127 |             | FilloutTheField |
      |                 | UserUser123 | FilloutTheField |
      |                 | UserUser123 | FilloutTheField |
      |                 | UserUser123 | FilloutTheField |

  @FLT-1848 @Login
  Scenario: User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link

    When User clicks the Forgot your password button
    Then User land on the "Forgot Password" page


  @FLT-1849 @Login
  Scenario: User should be able to see "Remember Me" link and click it on.

    When User sees the Remember Me link on the login page
    Then User can click the Remember Me checkbox


  @FLT-1850 @Login
  Scenario: User should see the password in bullet signs by default

    When User enters the password
    Then User sees the password in bullet signs

  @FLT-1851 @Login
  Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

    When User enters the username
    And User enters the password and use Enter keyword
    Then user should be able to see the Quick Launchpad in the home page

  @FLT-1852 @Login
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login

    When User enters the username "<username>"
    And User enters the password "<password>"
    And User clicks login button
    Then User should be able to see "<OwnUsername>" in the profile menu



    Examples:
      | username        | password    | OwnUsername |
      | user1           | UserUser123 | John Doe    |
      | storemanager51  | UserUser123 | John Doe    |
      | salesmanager127 | UserUser123 | John Doe    |