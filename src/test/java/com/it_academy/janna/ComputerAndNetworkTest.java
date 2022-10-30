package com.it_academy.janna;

import com.it_academy.janna.page_object.ComputerAndNetworkPage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.it_academy.janna.page_object.BaseOnlinerPage.*;

public class ComputerAndNetworkTest extends AnnotationTest {

    private List<String> getExpectedComputerAndNetworksCategoryList() {
        List<String> computerAndNetworkName = new ArrayList<>();
        computerAndNetworkName.add(EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_1);
        computerAndNetworkName.add(EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_2);
        computerAndNetworkName.add(EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_3);
        computerAndNetworkName.add(EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_4);
        return computerAndNetworkName;
    }

    @Test
    public void testCheckCatalogSectionComputerAndNetwork() {
        ComputerAndNetworkPage computerAndNetworkPage = new ComputerAndNetworkPage();
        Assertions.assertThat(computerAndNetworkPage.getComputerAndNetworksCategoryItemsList())
                .as("The vertical list of section items does not appear or the item(s) " +
                        EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_1 +
                        EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_2 +
                        EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_3 +
                        EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_4 + "are missing.")
                .map(WebElement::getText)
                .containsAll(getExpectedComputerAndNetworksCategoryList());
    }
}
