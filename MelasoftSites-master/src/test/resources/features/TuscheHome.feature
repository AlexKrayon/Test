Feature: TuscheHome

  @TuscheHome @all
  Scenario: Checking TuscheHome website
    Given the user navigates to "tuschehome" website
    Then verify that the tuschehome site is opened
    When the user clicks About button
    Then verify that About page is opened
    And the user goes back the previous page
    When the user hovers Products button and clicks Towels button
    Then verify that Towels page is opened
    When the user hovers Products button and clicks Baby button
    Then verify that Baby page is opened
    When the user hovers Products button and clicks Bathrobes button
    Then verify that Bathrobes page is opened
    When the user clicks Contact button
    Then verify that Contact page is opened
    When the user clicks Shop button
    Then verify that Amazon page is opened
    Given the user navigates to "tuschehome" website
    When the user clicks Send Message button
    Then verify that Bu alan zorunludur message is displayed