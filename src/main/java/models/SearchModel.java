package models;

import UiObjects.ItineraryUi;
import UiObjects.SearchUi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ActionsTest;

import java.util.List;

public class SearchModel {
    private WebDriver driver;
    private SearchUi searchUi;
    private ItineraryUi itineraryUi;

    public SearchModel(WebDriver driver) {
        this.driver = driver;
        this.searchUi = new SearchUi();
        this.itineraryUi = new ItineraryUi();
    }

    public void validateResultsSearch() throws InterruptedException {
        WebElement contentResults = ActionsTest.waitForElement(driver, searchUi.contentResults, 5);
        List<WebElement> velas = contentResults.findElements(By.tagName("article"));
        if(velas.size() == 0) {
            System.out.println("Erro agregarlo al reporte");
            return;
        }
        for (WebElement item : velas) {
            WebElement day = driver.findElement(searchUi.lbDayCruise);
            if(Integer.parseInt(day.getText()) < 6 || Integer.parseInt(day.getText()) > 9) {
                System.out.println("error agregarlo al reporte");
            }
        }
    }

    public void selectCruise() throws InterruptedException {
        WebElement contentResults = ActionsTest.waitForElement(driver, searchUi.contentResults, 5);
        List<WebElement> cruises = contentResults.findElements(By.tagName("article"));
        cruises.get(0).findElement(searchUi.btnLearnMore).click();
        ActionsTest.waitForElement(driver, itineraryUi.booking, 5);
    }

    public void validateFilterPrice() throws InterruptedException {
        ActionsTest.click(driver, searchUi.btnFilterPrice);
        Thread.sleep(1000);
        WebElement circleMin = driver.findElement(searchUi.circleMinFilterPrice);
        Actions build = new Actions(driver);
        build.dragAndDropBy(circleMin, 300, circleMin.getLocation().getY()).build().perform();
        Thread.sleep(1000);
        ActionsTest.click(driver, searchUi.btnFilterPrice);
        Thread.sleep(1000);

        WebElement contentResults = ActionsTest.waitForElement(driver, searchUi.contentResults, 5);
        List<WebElement> cruises = contentResults.findElements(By.tagName("article"));
        int mayor = 0;
        for (WebElement item : cruises) {
            WebElement price = driver.findElement(By.cssSelector("span.vrgf-price-box__price-value.ng-binding"));
            int priceItem = Integer.parseInt(price.getText());
            if(mayor <= priceItem) {
                mayor = priceItem;
            } else {
                System.out.println("error agragarlo al reporte");
            }
        }
    }
}
