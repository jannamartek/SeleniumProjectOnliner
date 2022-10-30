package com.it_academy.janna.page_object;

import com.it_academy.janna.framework.DriverManager;
import org.openqa.selenium.By;

public class OnlinerHomePage extends BaseOnlinerPage {

    public OnlinerHomePage() {
        DriverManager.getDriver().get(ONLINER_LINK);
    }

    public CatalogPage clickOnCatalogLink() {
        waitForElementVisible(By.xpath(ONLINER_CATALOG_PATTERN)).click();
        return new CatalogPage();
    }
}
