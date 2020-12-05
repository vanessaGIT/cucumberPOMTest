Feature: Validate itinerary of the trip
  -- As a user I want to choose one sail and learn more about the trip, so that I will get more info about itinerary

  @smoke
  Scenario: validate the selection of a cruise
    Given I open the Carnival page
    Then I validate search form
    When I enter SailTo data
    And I enter Duration
    And I give a click on Search Cruises
    Then I validate the result of the search
    When I select a cruise of the results of search
    Then Validate information of selected Cruise
    And Validate detail of one day
    And Validate that the reservation button is displayed
