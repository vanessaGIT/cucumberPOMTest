package UiObjects;

import org.openqa.selenium.By;

public class SearchUi {
    public By contentResults = By.className("ccs-search-results");
    public By btnFilterPrice = By.cssSelector("li.sfn-nav__item.sfn-nav__item-pricing");
    public By circleMinFilterPrice = By.cssSelector("span.rz-pointer.rz-pointer-min");
}
