package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.HomeModel;
import models.SearchModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Context;

public class SearchCruisesSteps extends BaseSteps {

    public SearchCruisesSteps() {
        super();
        this.homeModel = new HomeModel(this.driver);
        this.searchModel = new SearchModel(this.driver);
    }

    @Given("I open the Carnival page")
    public void iOpenTheCarnivalPage() throws InterruptedException {
        this.homeModel.openPage();
    }

    @Then("I validate search form")
    public void iValidateSearchForm() throws InterruptedException {
        this.homeModel.validateSearchForm();
    }

    @When("I enter SailTo data")
    public void iEnterSailToData() throws InterruptedException {
        this.homeModel.selectSailTo();
    }

    @And("I enter Duration")
    public void iEnterDuration() throws InterruptedException {
        this.homeModel.selectDuration();
    }

    @And("I give a click on Search Cruises")
    public void iGiveAClickOnSearchCruises() {
        this.homeModel.clicBtnSearchCruises();
    }

    @Then("I validate the result of the search")
    public void iValidateTheResultOfTheSearch() throws InterruptedException {
        this.searchModel.validateResultsSearch();
    }

    @And("Validate the filter price")
    public void validateTheFilterPrice() throws InterruptedException {
        this.searchModel.validateFilterPrice();
    }
}
