Feature: Recovery password page

  Scenario: Go to captcha block after enter email
    Given I'm on main page
    When I click login button
    And I click recovery button
    And I enter email and click submit
    Then I check open captcha block