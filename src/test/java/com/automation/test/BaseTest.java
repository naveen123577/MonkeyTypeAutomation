package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createDriver();
        homePage = new HomePage();
    }
    @AfterMethod
    public void clean(){
//        DriverManager.getDriver().quit();
    }
}
