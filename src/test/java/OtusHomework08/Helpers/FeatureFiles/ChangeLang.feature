Feature: Change lang

  Scenario: Change lang to gbr
    Given I'm on main page
    When I click change lang button
    And I choose gbr lang
    Then I see site on gbr lang