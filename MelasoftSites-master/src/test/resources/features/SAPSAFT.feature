Feature: SAP SAF-T

  @SAPSAFT @all
  Scenario: Checking SAP SAF-T website
    Given the user navigates to "SAPSAF-T" website
    Then verify that SAP SAF-T website is opened
    When the user clicks on "ABOUT US" on header
    Then verify that About Us page is opened in SAP SAF-T
    When the user clicks on "SAP EINVOICE" on header
    Then verify that the SAP-eInvoice website is opened on another tab
    When the user clicks on "AUSTRIA" on header
    Then verify that the Austria SAF-T Process page is opened
    When the user clicks on "NORWAY" on header
    Then verify that the SAF-T Process in Norway page is opened
    When the user clicks on "ROMANIA" on header
    Then verify that the Romania SAF-T Process page is opened
    When the user clicks on "PORTUGAL" on header
    Then verify that the SAF-T Process in Portugal page is opened
    When the user clicks on "CONTACT" on header
    Then verify that the Contact page is opened
    When the user clicks on "HOME" on header
    Then verify that SAP SAF-T website is opened
    When the user clicks on "Facebook" social media icon
    Then verify that Facebook page is opened on another tab
#    When the user clicks on "Twitter" social media icon
#    Then verify that Twitter page is opened on another tab
    When the user clicks on "YouTube" social media icon
    Then verify that YouTube page is opened on another tab
#    When the user clicks on "Instagram" social media icon
#    Then verify that Instagram page is opened on another tab
#    When the user clicks on "LinkedIn" social media icon
#    Then verify that LinkedIn page is opened on another tab
    Then the user clicks on READ MORE button for "AUSTRIA"
    Then verify that the Austria SAF-T Process page is opened
    And the user goes back the previous page
    Then the user clicks on READ MORE button for "NORWAY"
    Then verify that the SAF-T Process in Norway page is opened
    And the user goes back the previous page
    Then the user clicks on READ MORE button for "PORTUGAL"
    Then verify that the SAF-T Process in Portugal page is opened
    And the user goes back the previous page
    Then the user clicks on READ MORE button for "ROMANIA"
    Then verify that the Romania SAF-T Process page is opened



