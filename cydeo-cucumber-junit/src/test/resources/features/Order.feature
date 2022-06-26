Feature: Web table user order feature

  @order
  Scenario: User should be able to place order and order seen in the table
    Given user is already logged in and on order page
    When user selected product type "Familybea"
    And user enter quantity "2"
    And user enters customer name "Ali Gel"
    And user enters street "Yeni Camii Street"
    And user enters city "London"
    And user enters zip "84102"
    And user selects credit card type "world card"
    And user enters credit card number"1234432156788765"
    And user enters expired date "12/23"
    And user enters process order button
    Then user should see "Ali Gel" in the first row of the web table