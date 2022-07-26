Feature: SAP-eInvoice

  @SAPEInvoice @all
  Scenario: Checking SAP-eInvoice website
    Given the user navigates to "SAP-eInvoice" website
    Then verify that the SAP-eInvoice site is opened
    And verify that Now chatting is appeared
    When the user clicks Read More button for "TURKEY"
    Then verify that the page which is related with Read More button for TURKEY button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "EUROPE"
    Then verify that the page which is related with Read More button for EUROPE button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "GERMANY"
    Then verify that the page which is related with Read More button for GERMANY button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "FRANCE"
    Then verify that the page which is related with Read More button for FRANCE button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "HUNGARY"
    Then verify that the page which is related with Read More button for HUNGARY button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "PORTUGAL"
    Then verify that the page which is related with Read More button for PORTUGAL button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "SERBIA"
    Then verify that the page which is related with Read More button for SERBIA button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "EGYPT"
    Then verify that the page which is related with Read More button for EGYPT button is opened
    And the user goes back the previous page
    When the user clicks Read More button for "KAZAKHSTAN"
    Then verify that the page which is related with Read More button for KAZAKHSTAN button is opened
    And the user goes back the previous page
    When the user clicks "facebook" icon in SAP-eInvoice homepage
    Then verify that Facebook Melasoft page is opened
#    When the user clicks "twitter" icon in SAP-eInvoice homepage
#    Then verify that Twitter Melasoft page is opened
    When the user clicks "youtube" icon in SAP-eInvoice homepage
    Then verify that Youtube Melasoft page is opened
#    When the user clicks "instagram" icon in SAP-eInvoice homepage
#    Then verify that Instagram Melasoft page is opened
#    When the user clicks "linkedin" icon in SAP-eInvoice homepage
#    Then verify that Linkedin Melasoft page is opened
    When the user navigates to "TURKEY" - "TURKEY | E-Accounting Slip" in SAP-eInvoice
    Then verify that Turkey Accounting Slip page is opened in SAP eInvoice website
    When the user navigates to "TURKEY" - "TURKEY | E-Archive" in SAP-eInvoice
    Then verify that Turkey E-Archive page is opened in SAP eInvoice website
    When the user navigates to "TURKEY" - "TURKEY | E-Invoice" in SAP-eInvoice
    Then verify that Turkey E-Invoice page is opened in SAP eInvoice website
    When the user navigates to "TURKEY" - "TURKEY | E-Ledger" in SAP-eInvoice
    Then verify that Turkey E-Ledger page is opened in SAP eInvoice website
    When the user navigates to "TURKEY" - "TURKEY | E-Waybill" in SAP-eInvoice
    Then verify that Turkey E-Waybill page is opened in SAP eInvoice website
    When the user navigates to "EUROPE" - "EUROPE | Peppol" in SAP-eInvoice
    Then verify that Europe PEPPOL page is opened in SAP eInvoice website
    When the user navigates to "EUROPE" - "FRANCE | E-Invoice" in SAP-eInvoice
    Then verify that France eInvoice page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "FRANCE | Factur-X" in SAP-eInvoice
    Then verify that France Factur-X page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "GERMANY | XRechnung and ZUGFeRD" in SAP-eInvoice
    Then verify that Germany XRechnung and ZUGFeRD page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "HUNGARY | RTIR E-Invoice" in SAP-eInvoice
    Then verify that Hungary RTIR E-Invoice page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "POLAND | E-Faktura" in SAP-eInvoice
    Then verify that Poland E-Faktura page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "PORTUGAL | E-Invoice" in SAP-eInvoice
    Then verify that Portugal E-Invoice page is opened in SAP e-Invoice website
    When the user navigates to "EUROPE" - "SERBIA | E-Invoice" in SAP-eInvoice
    Then verify that Serbia E-Invoice page is opened in SAP e-Invoice website
    When the user navigates to "ASIA" - "KAZAKHSTAN | E-Invoice" in SAP-eInvoice
    Then verify that Kazakhstan E-Invoice page is opened in SAP e-Invoice website
    When the user navigates to "ASIA" - "KAZAKHSTAN | Virtual Warehouse" in SAP-eInvoice
    Then verify that Kazakhstan Virtual Warehouse page is opened in SAP e-Invoice website
    When the user navigates to "ASIA" - "SAUDI ARABIAN | E-Invoice" in SAP-eInvoice
    Then verify that KSA E-Invoice page is opened in SAP e-Invoice website
    When the user navigates to "AFRICA" - "EGYPT | E-Invoice" in SAP-eInvoice
    Then verify that Egypt E-Invoice page is opened in SAP e-Invoice website
    When the user clicks About Us button
    Then verify that About Us page is opened in SAP-eInvoice
    When the user clicks Blog button in SAP-eInvoice
    Then verify that Blog page is opened in SAP-eInvoice
    When the user clicks Contact button in SAP-eInvoice
    Then verify that Contact page is opened in SAP-eInvoice
    When the user clicks HOME button in SAP-eInvoice
    Then verify that Home page is opened in SAP-eInvoice
    When the user changes language "English" into "Deutsch" in SAP-eInvoice
    Then verify that the page is in German in SAP-eInvoice
    When the user changes language "Deutsch" into "العربية" in SAP-eInvoice
    Then verify that the page is in Arabic in SAP-eInvoice
