package models;

import UiObjects.ItineraryUi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ActionsTest;

import java.util.List;

public class ItineraryModel {

    private WebDriver driver;
    private ItineraryUi itineraryUi;

    public ItineraryModel(WebDriver driver) {
        this.driver = driver;
        this.itineraryUi = new ItineraryUi();
    }

    public void validateInformationItinerary() throws InterruptedException {
        for (By item: itineraryUi.getItemsInformationItinerary()) {
            WebElement itemSearch = ActionsTest.waitForElement(driver, item, 5);
            if(itemSearch == null) {
                System.out.println("Error agregarlo al pdf");
            }
        }
    }

    public void validateDetailOfDay() {
        List<WebElement> btnsLearnMore = driver.findElements(By.className("about-cta"));
        ActionsTest.scroll(driver, 500);
        btnsLearnMore.get(1).click();
    }

    public void validateBtnBooking() throws InterruptedException {
        WebElement booking = ActionsTest.waitForElement(driver, itineraryUi.booking, 5);
        if(booking == null) {
            System.out.println("Error no se encontro el boton de booking");
        }
        booking.click();
    }
}
