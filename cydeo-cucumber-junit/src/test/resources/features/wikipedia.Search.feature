Feature: Wikipedia search functionality and verification

  @Fatih
  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  @Balci
  Scenario:  Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" in the main header

  @ScenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue    | expectedTitle  | expectedMainHeader |
      | Steve Jobs     | Steve Jobs     | Steve Jobs         |
      | Ronaldo        | Ronaldo        | Ronaldo            |
      | Bob Marley     | Bob Marley     | Bob Marley         |
      | Chuck Norris   | Chuck Norris   | Chuck Norris       |
      | Antony Hopkins | Antony Hopkins | Antony Hopkins     |
      | Lady Gaga      | Lady Gaga      | Lady Gaga          |

      # ctrl + alt + L



