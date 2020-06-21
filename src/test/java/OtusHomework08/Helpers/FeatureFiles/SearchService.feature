Feature: Search query

  Scenario: Enter search query
    Given I'm on main page
    When I fill query and click enter
    Then I see one query result