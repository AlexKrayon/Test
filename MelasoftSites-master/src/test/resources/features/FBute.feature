Feature: FBUTE

  @FBUTE @all
  Scenario: Checking FBUTE website
    Given the user navigates to "FBUTE" website
    Then verify that the FBUTE site is opened
    When the user clicks on DOWNLOAD FITLICH button
    Then verify that the Fitlich mobil app site is opened
    When the user clicks on Services
    Then verify that Services related part is opened
    When the user clicks on Road Map
    Then verify that Road Map related part is opened
    When the user clicks on Token
    Then verify that Token related part is opened
    When the user clicks on WhitePapers
    Then verify that WhitePapers related part is opened
#    When the user clicks on White Papers button
#    Then verify that the documentation is opened on another tab
    When the user clicks on Fitlich logo
    Then verify that the Fitlich site is opened on another tab
    When the user clicks on Melasoft logo
    Then verify that the Melasoft site is opened on another tab
#    When the user clicks on "twitter" social media icon on FBUTE
#    Then verify that Twitter related part is opened on another tab
    When the user clicks on "telegram" social media icon on FBUTE
    Then verify that Telegram related part is opened on another tab
    When the user clicks on "youtube" social media icon on FBUTE
    Then verify that Youtube related part is opened on another tab
    When the user clicks on "reddit-alien" social media icon on FBUTE
    Then verify that Reddit related part is opened on another tab
    When the user clicks on "discord" social media icon on FBUTE
    Then verify that Discord related part is opened on another tab
    When the user clicks on "medium" social media icon on FBUTE
    Then verify that Medium related part is opened on another tab