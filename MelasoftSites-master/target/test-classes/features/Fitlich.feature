Feature: Fitlich

  @Fitlich @all
  Scenario: Checking Fitlich website
    Given the user navigates to "Fitlich" website
    Then verify that the fitlich site is opened
    When the user clicks Privacy Policy
    Then verify that Privacy Policy page is opened
    And the user goes back the previous page
    When the user clicks OK button for cookies on bottom
    Then verify that cookies bar doesn't appear
#    When the user clicks App Store button
#    Then verify that App Store page is opened
#    And the user goes back the previous page
#    When the user clicks Google Play button
#    Then verify that Google Play page is opened
#    And the user goes back the previous page
    When the user clicks FITLICH BLOG button
    Then verify that FITLICH BLOG page is opened
    And the user goes back the previous page
    When the user clicks melasoft logo
    Then verify that the Melasoft site is opened in Fitlich
    When the user clicks Facebook icon
    Then verify that Facebook Fitlich page is opened
#    When the user clicks Instagram icon
#    Then verify that Instagram Fitlich page is opened
#    When the user clicks Twitter icon GmbH
#    Then verify that Twitter Fitlich page is opened
    When the user clicks Youtube icon
    Then verify that Youtube Fitlich page is opened
    When the user clicks Telegram icon
    Then verify that Telegram Fitlich page is opened
    When the user clicks Discord icon
    Then verify that Discord Fitlich page is opened
    When the user clicks Blogger icon
    Then verify that Blogger Fitlich page is opened
    When the user clicks Wilhelm-Leuschner-Straße 10, 60329 Frankfurt am Main Deutschland
    Then verify that location of Melasoft Information Technologies page is opened
