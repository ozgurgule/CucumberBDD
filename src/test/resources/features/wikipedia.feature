Feature: wikipedia Search Feature
  @wikipedia

  Scenario: Wikipedia search title verification
    Given user is on the wikipedia main page
    When user searches for fungus
    And user clicks seacrh button
    Then user should see fungus on the title