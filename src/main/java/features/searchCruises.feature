Feature: Validate the search of the cruise to The Bahamas
  -- As a user I want to search cruises to The Bahamas with duration between 6 and 9 days so that I will visualize all the options to choose one.
     Right now, I don’t care about departure port.
  @smoke
  Scenario: Validate the search form
    Given I open the Carnival page
    Then I validate search form
    When I enter SailTo data
    And I enter Duration
    And I give a click on Search Cruises
    Then I validate the result of the search
    And Validate the filter price