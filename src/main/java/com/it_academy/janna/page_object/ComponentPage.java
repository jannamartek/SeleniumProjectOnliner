package com.it_academy.janna.page_object;

import com.it_academy.janna.framework.DriverManager;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.it_academy.janna.page_object.ComputerAndNetworkPage.clickOnCatalogClassifierLink;
import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class ComponentPage extends BaseOnlinerPage {

    public ComponentPage() {
        DriverManager.getDriver().get(CATALOG_ONLINER_LINK);
    }

    public static List<WebElement> getAccessoriesCategorySideListItemsTitle() {
        return waitForElementsVisible(xpath(CATALOG_ACCESSORIES_DROPDOWN_LIST_ITEMS_TITLE));
    }

    public static List<WebElement> getAccessoriesCategorySideListItemsDescription() {
        return waitForElementsVisible(xpath(CATALOG_ACCESSORIES_DROPDOWN_LIST_ITEMS_DESCRIPTION));
    }

    public void clickOnComputerAndNetworksCategoryLink(String categoryName) {
        clickOnCatalogClassifierLink(COMPUTER_AND_NETWORK_CATEGORY_NAME);
        waitForElementVisible(xpath(format(CATALOG_COMPUTER_AND_NETWORK_LIST_ASIDE_ITEM_LINK_PATTERN, categoryName)))
                .click();
    }

    public void clickOnAccessoriesCategoryButton() {
        clickOnComputerAndNetworksCategoryLink(ACCESSORIES_CATEGORY_NAME);
    }
}
