package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import UiObjects.HomeUi;
import org.openqa.selenium.interactions.Actions;
import utils.ActionsTest;

import java.util.List;

public class HomeModel {
    private WebDriver driver;
    HomeUi homeui = new HomeUi();

    public HomeModel(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() throws InterruptedException {
        this.driver.get("https://www.carnival.com/");
        WebElement alert = ActionsTest.waitForElement(driver, homeui.alertClose, 5);
        if(alert != null){
            Actions builder = new Actions(driver);
            builder.click(alert).perform();
        }
    }

    public void validateSearchForm() throws InterruptedException {
        for (By item: homeui.itemsSearch()) {
            WebElement itemSearch = ActionsTest.waitForElement(driver, item, 5);
            if(itemSearch == null) {
                System.out.println("Error agregarlo al pdf");
            }
        }
    }

    public void selectSailTo() throws InterruptedException {
        ActionsTest.click(driver, homeui.filterOrigin);

        WebElement ulOptions = driver.findElement(homeui.ulOptionsOrigin);
        List<WebElement> optionsSailTo = ulOptions.findElements(By.tagName("li"));
        for(WebElement item : optionsSailTo) {
            if(item.getText().equals("The Bahamas")) {
                Thread.sleep(1000);
                item.click();
            }
        }
    }

    public void selectDuration() throws InterruptedException {
        ActionsTest.click(driver, homeui.filterDuration);
        WebElement ulOptions = driver.findElement(homeui.ulOptionsDuration);
        List<WebElement> optionsDuration = ulOptions.findElements(By.tagName("li"));
        for(WebElement item : optionsDuration) {
            if(item.getText().equals("6 - 9 Days")) {
                Thread.sleep(1000);
                item.click();
            }
        }
    }
    public void clicBtnSearchCruises() {
        ActionsTest.click(driver, homeui.btnSearchCruises);
    }
}


