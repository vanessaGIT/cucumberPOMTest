package stepDefinition;

import UiObjects.HomeUi;
import UiObjects.SearchUi;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ItineraryModel;
import models.SearchModel;
import org.openqa.selenium.WebDriver;
import utils.Context;

public class ItinerarySteps {
    private SearchModel searchModel;
    private ItineraryModel itineraryModel;

    public ItinerarySteps(Context context) {
        this.searchModel = new SearchModel(context.getDriver());
        this.itineraryModel = new ItineraryModel(context.getDriver());
    }

    @When("I select a cruise of the results of search")
    public void iSelectACruiseOfTheResultsOfSearch() throws InterruptedException {
        searchModel.selectCruise();
    }

    @Then("Validate information of selected Cruise")
    public void validateInformationOfSelectedCruise() throws InterruptedException {
        itineraryModel.validateInformationItinerary();
    }

    @And("Validate detail of one day")
    public void validateDetailOfOneDay() {
        itineraryModel.validateDetailOfDay();
    }

    @And("Validate that the reservation button is displayed")
    public void validateThatTheReservationButtonIsDisplayed() throws InterruptedException {
        itineraryModel.validateBtnBooking();
    }
}
