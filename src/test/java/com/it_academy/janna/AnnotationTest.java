package com.it_academy.janna;

import com.it_academy.janna.framework.DriverManager;
import com.it_academy.janna.page_object.OnlinerHomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AnnotationTest {
    private static OnlinerHomePage onlinerHomePage;

    @BeforeClass
    public static void setup() {
        DriverManager.setDriver();
        onlinerHomePage = new OnlinerHomePage();
    }

    @AfterClass
    public static void teardown() {
        DriverManager.closeDriver();
    }
}
