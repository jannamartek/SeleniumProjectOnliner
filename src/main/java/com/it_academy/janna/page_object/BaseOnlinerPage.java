package com.it_academy.janna.page_object;

import com.it_academy.janna.framework.AbstractBasePage;

public abstract class BaseOnlinerPage extends AbstractBasePage {
    public static final String ONLINER_LINK = "https://www.onliner.by/";
    public static final String CATALOG_ONLINER_LINK = "https://catalog.onliner.by/";
    public static final String ONLINER_CATALOG_PATTERN = "//*[@class='b-top-menu']//a[contains(@href,'catalog')]";
    public static final String CATALOG_CLASSIFIER_ITEM_LINK_PATTERN = "//li[.//span[contains(text(),'%s')]]";
    public static final String CATALOG_CLASSIFIER_ITEMS_LINK =
            "//li[.//span[contains(@class,'icon_id')]]//span[contains(@class,'wrapper')]";
    public static final String CATALOG_COMPUTER_AND_NETWORK_LIST_ASIDE_ITEMS =
            "//div[@data-id=2]//div[contains(@class,'aside-title')]";
    public static final String CATALOG_COMPUTER_AND_NETWORK_LIST_ASIDE_ITEM_LINK_PATTERN =
            "//div[@data-id=2]//div[contains(text(),'%s')]";
    public static final String CATALOG_ACCESSORIES_DROPDOWN_LIST_ITEMS_TITLE =
            "//div[contains(@style,'block')]//div[./div[contains(text(),'Комплектующие')]]" +
                    "//span[contains(@class,'title')]";
    public static final String CATALOG_ACCESSORIES_DROPDOWN_LIST_ITEMS_DESCRIPTION =
            "//div[contains(@style,'block')]//div[./div[contains(text(),'Комплектующие')]]" +
                    "//span[contains(@class,'description')]";
    public static final String COMPUTER_AND_NETWORK_CATEGORY_NAME = "Компьютеры";
    public static final String ACCESSORIES_CATEGORY_NAME = "Комплектующие";
    public static final String EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_1 = "Ноутбуки, компьютеры, мониторы";
    public static final String EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_2 = "Комплектующие";
    public static final String EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_3 = "Хранение данных";
    public static final String EXPECTED_SECTIONS_IN_COMPUTER_AND_NETWORKS_NAME_4 = "Сетевое оборудование";
    public static final String SPACES_PATTERN = "[\s]+";
    public static final int EXPECTED_NUMBER_ACCESSORIES_DROPDOWN_LIST_ITEMS = 14;
    public static final String EXPECTED_ACCESSORIES_DROPDOWN_LIST_DESCRIPTION_GOOD = "товар";
    public static final String EXPECTED_ACCESSORIES_DROPDOWN_LIST_DESCRIPTION_MIN_PRICE = "р";
    public static final String EXPECTED_SECTION_NAME_1 = "Электроника";
    public static final String EXPECTED_SECTION_NAME_2 = "Компьютеры и сети";
    public static final String EXPECTED_SECTION_NAME_3 = "Бытовая техника";
    public static final String EXPECTED_SECTION_NAME_4 = "Стройка и ремонт";
    public static final String EXPECTED_SECTION_NAME_5 = "Дом и сад";
    public static final String EXPECTED_SECTION_NAME_6 = "Авто и мото";
    public static final String EXPECTED_SECTION_NAME_7 = "Красота и спорт";
    public static final String EXPECTED_SECTION_NAME_8 = "Детям и мамам";
    public static final String EXPECTED_SECTION_NAME_9 = "Работа и офис";
    public static final String EXPECTED_SECTION_NAME_10 = "Еда";
}
