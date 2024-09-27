package com.automation.test;

import org.testng.annotations.Test;

public class MonkeyAutomation extends BaseTest {
    @Test
    public void typeAutomation(){
        homePage.openWebsite();
        homePage.typeWords();
    }
}
