package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActionsTest {

    public static void click(WebDriver driver, By locator) {
        driver.findElement(locator).click();
    }

    public static WebElement getElementInList(WebDriver driver, By locator, String text) {
        List<WebElement> options = driver.findElements(locator);
        for(WebElement item : options) {
            if(item.getText().equals(text)) {
                return item;
            }
        }
        return null;
    }

    public static WebElement waitForElement(WebDriver driver, By locator, int timeOut) throws InterruptedException {
        if(timeOut == 0) {
            return null;
        }
        List<WebElement> elements = driver.findElements(locator);
        if(elements.size() > 0) {
            return elements.get(0);
        }
        Thread.sleep(1000);
        return waitForElement(driver, locator, timeOut - 1);
    }
}
