Feature: Validate the operation of the Home page
  -- Validate the search form and other operations

  Scenario: Validate the search form
    Given I open the Carnival page
    Then I validate search form
    When I enter SailTo data
    And I enter Duration
    And I give a click on Search Cruises
    Then I validate the result of the search