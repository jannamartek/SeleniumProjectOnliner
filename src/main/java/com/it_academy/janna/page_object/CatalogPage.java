package com.it_academy.janna.page_object;

import com.it_academy.janna.framework.DriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class CatalogPage extends BaseOnlinerPage {

    public CatalogPage() {
        DriverManager.getDriver().get(CATALOG_ONLINER_LINK);
    }

    public List<WebElement> getCatalogClassifierItems() {
        return waitForElementsVisible(xpath(CATALOG_CLASSIFIER_ITEMS_LINK));
    }
}
