package com.it_academy.janna;

import com.it_academy.janna.page_object.CatalogPage;
import com.it_academy.janna.page_object.ComponentPage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.it_academy.janna.page_object.BaseOnlinerPage.*;

public class ComponentPageTest extends AnnotationTest {

    @Test
    public void testAccessoriesDropdownListItemsContent() {
        CatalogPage catalogPage = new CatalogPage();
        ComponentPage componentPage = new ComponentPage();
        componentPage.clickOnAccessoriesCategoryButton();
        List<WebElement> dropDownListItemsTitle = ComponentPage.getAccessoriesCategorySideListItemsTitle();
        List<WebElement> dropDownListItemsDescription = ComponentPage.getAccessoriesCategorySideListItemsDescription();
        Assertions.assertThat(dropDownListItemsTitle)
                .as("Wrong number of items in dropdown menu")
                .hasSize(EXPECTED_NUMBER_ACCESSORIES_DROPDOWN_LIST_ITEMS)
                .map(WebElement::getText)
                .noneMatch(String::isEmpty)
                .noneMatch(el -> el.matches(SPACES_PATTERN));
        Assertions.assertThat(dropDownListItemsDescription)
                .as("In the list of components, one of the elements does not contain: " +
                        "the name or quantity of goods or the minimum price.")
                .hasSize(EXPECTED_NUMBER_ACCESSORIES_DROPDOWN_LIST_ITEMS)
                .map(WebElement::getText)
                .allMatch(el -> el.contains(EXPECTED_ACCESSORIES_DROPDOWN_LIST_DESCRIPTION_GOOD))
                .allMatch(el -> el.contains(EXPECTED_ACCESSORIES_DROPDOWN_LIST_DESCRIPTION_MIN_PRICE));
    }
}
