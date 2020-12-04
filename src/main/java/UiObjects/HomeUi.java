package UiObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeUi {

    public By alertClose= By.className("vifp-close");
    public By filterOrigin = By.id("cdc-destinations");
    public By ulOptionsOrigin = By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ccl-search-bar-expandable-filter/div/ul");
    //public  By validateCheckOption=By.xpath("");
    public By filterDuration = By.id("cdc-durations");
    public By ulOptionsDuration = By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ul");
    public By formSearchCruises = By.id("ccl-cruise-search");
    //Obtener active cuadricula con get atributte
    public By GridOptions = By.xpath("//*[@id=\"ccl-refresh-homepage\"]/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div");
    public By btnSearchCruises = By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/ul/li[5]/a");

    public List<By> itemsSearch() {
        return Arrays.asList(filterOrigin, filterDuration);
    }


}
