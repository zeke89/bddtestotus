Feature: Register on site

  Scenario: Register on site
    Given I'm on registration page
    When I fill last name, name, phone and password on form
    And I submit form
    Then I see code phone block