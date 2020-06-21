Feature: Login on site

  Scenario: Login on site
    Given I'm on login page
    When I fill login and password on form
    And I submit form
    Then I see profile name in header