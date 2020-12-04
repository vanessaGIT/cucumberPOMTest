package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Context {
    private WebDriver driver;

    public Context() {
        String url=System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"+ File.separator+"resources"+ File.separator+"ChromeDriver"+ File.separator+"chromedriver";
        System.setProperty("webdriver.chrome.driver",url);
        this.driver = new ChromeDriver();
    }

    // getters and setters
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
