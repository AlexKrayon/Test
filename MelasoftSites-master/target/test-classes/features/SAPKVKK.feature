Feature: SAP-KVKK

  @SAPKVKK @all
  Scenario: Checking SAP-KVKK website
    Given the user navigates to "SAP-KVKK" website
    Then verify that the SAP-KVKK site is opened
    And verify that Now chatting is appeared
    When the user clicks Hemen Basla button
    Then verify that the page which is related with Hemen Basla (SAP-KVKK) button is opened
    And the user goes back the previous page
    When the user clicks Daha Fazla Bilgi Icin button
    Then verify that the page which is related with Daha Fazla Bilgi Icin button is opened
    And the user goes back the previous page
    When the user clicks Melasoft e-Acik Riza Sistemi button
    Then verify that the page which is related with Melasoft e-Acik Riza Sistemi button is opened
    When the user clicks SSS (down) button
    Then verify that SSS page is opened
    And the user goes back the previous page
    When the user clicks Blog (KVKK) button
    Then verify that Blog (KVKK) page is opened
    And the user goes back the previous page
    When the user clicks SSS (up) button
    Then verify that SSS page is opened