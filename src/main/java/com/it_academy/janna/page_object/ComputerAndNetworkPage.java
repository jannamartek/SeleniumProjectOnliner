package com.it_academy.janna.page_object;

import com.it_academy.janna.framework.DriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class ComputerAndNetworkPage extends BaseOnlinerPage {

    public ComputerAndNetworkPage() {
        DriverManager.getDriver().get(CATALOG_ONLINER_LINK);
    }

    public static void clickOnCatalogClassifierLink(String categoryName) {
        waitForElementVisible(xpath(format(CATALOG_CLASSIFIER_ITEM_LINK_PATTERN, categoryName))).click();
    }

    public static List<WebElement> getComputerAndNetworksCategoryItemsList() {
        clickOnCatalogClassifierLink(COMPUTER_AND_NETWORK_CATEGORY_NAME);
        return waitForElementsVisible(xpath(CATALOG_COMPUTER_AND_NETWORK_LIST_ASIDE_ITEMS
        ));
    }
}


