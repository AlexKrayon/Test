Feature: e-Invoice

  @EInvoice @all
  Scenario: Checking e-Invoice website
    Given the user navigates to "e-Invoice" website
    Then verify that the e-Invoice site is opened
    And verify that Now chatting is appeared
    When the user clicks APPLY NOW button
    Then verify that the page which is related with APPLY NOW button is opened
    And the user goes back the previous page
    When the user clicks Learn More button (Developing your Business ideas)
    Then verify that the page which is related with Learn More (Developing your Business ideas) button is opened
    And the user goes back the previous page
    When the user clicks Learn More button (e-Invoice for Turkey)
    Then verify that the page which is related with Learn More (e-Invoice for Turkey) button is opened
    And the user goes back the previous page
    When the user clicks FAQ (e-Invoice) button
    Then verify that the page which is related with FAQ (e-Invoice) button is opened

