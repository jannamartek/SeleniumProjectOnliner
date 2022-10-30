package com.it_academy.janna;

import com.it_academy.janna.framework.DriverManager;
import com.it_academy.janna.page_object.OnlinerHomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.it_academy.janna.page_object.BaseOnlinerPage.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CatalogPageTest {
    private static OnlinerHomePage onlinerHomePage;

    private List<String> getExpectedInCatalogSections() {
        List<String> expectedCatalogSectionName = new ArrayList<>();
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_1);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_2);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_3);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_4);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_5);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_6);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_7);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_8);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_9);
        expectedCatalogSectionName.add(EXPECTED_SECTION_NAME_10);
        return expectedCatalogSectionName;
    }

    @BeforeClass
    public static void setup() {
        DriverManager.setDriver();
        onlinerHomePage = new OnlinerHomePage();
    }

    @Test
    public void testCheckInCatalogSections() {
        List<WebElement> catalogElements = onlinerHomePage
                .clickOnCatalogLink()
                .getCatalogClassifierItems();
        assertThat(catalogElements)
                .as("Some items were not found on the catalog page")
                .map(WebElement::getText)
                .containsExactlyElementsOf(getExpectedInCatalogSections());
    }

    @AfterClass
    public static void teardown() {
        DriverManager.closeDriver();
    }
}