Feature: e-Reconciliation

  @EReconciliation @all
  Scenario: Checking e-Reconciliation website
    Given the user navigates to "e-Reconciliation" website
    Then verify that the e-Reconciliation site is opened
    And verify that Now chatting is appeared
    When the user clicks Get a Quote button
    Then verify that the page which is related with Get a Quote button is opened
    And the user goes back the previous page
    When the user clicks Detailed Info (e-declaration) button
    Then verify that the page which is related with Detailed Info (e-declaration) button is opened
    And the user goes back the previous page
    When the user clicks Detailed Info (e-account) button
    Then verify that the page which is related with Detailed Info (e-account) button is opened
    And the user goes back the previous page
    When the user clicks e-Consent button
    Then verify that e-Consent page is opened
    And the user goes back the previous page
    When the user clicks e-Account Statement button
    Then verify that e-Account Statement page is opened
    And the user goes back the previous page
    When the user clicks Blog button
    Then verify that Blog page is opened
    And the user goes back the previous page
    When the user clicks Contact Us button
    Then verify that Contact Us page is opened
    And the user goes back the previous page
    When the user clicks Login button
    Then verify that Login page is opened
    And the user goes back the previous page
#    When the user clicks Register button
#    Then verify that Register popup is opened
#    And the user closes Register popup
    When the user clicks Turkce button
    Then verify that the page is converted into Turkish language
    And the user goes back the previous page
    When the user clicks Deutsch button
    Then verify that the page is converted into German language

