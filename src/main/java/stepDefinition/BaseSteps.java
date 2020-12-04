package stepDefinition;

import models.HomeModel;
import models.SearchModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BaseSteps {

    protected WebDriver driver;
    protected HomeModel homeModel;
    protected SearchModel searchModel;

    public BaseSteps() {
        String url=System.getProperty("user.dir")+File.separator+"src"+ File.separator+"main"+ File.separator+"resources"+ File.separator+"ChromeDriver"+ File.separator+"chromedriver";
        System.setProperty("webdriver.chrome.driver",url);
        this.driver = new ChromeDriver();
    }
}
