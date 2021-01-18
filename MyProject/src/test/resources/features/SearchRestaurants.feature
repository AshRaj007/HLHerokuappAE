Feature: Search Restaurant and Order Food
#As a user, I want to search for restaurants and order food

  Scenario: Search for restaurants in an area

    Given I open the Just Eat website
    When I enter the postcode "AR51 1AA"
    And I click on Find restaurants
    Then I see the restaurants returned for postcode