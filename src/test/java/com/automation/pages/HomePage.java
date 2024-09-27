package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='word active']/letter")
    List<WebElement> words;

    @FindBy(id = "wordsInput")
    WebElement wordInput;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public void typeWords(){
        while (true) {
            try {
                words = driver.findElements(By.xpath("//div[@class='word active']/letter"));

                for (int i = 0; i < words.size(); i++) {
                    WebElement letter = driver.findElements(By.xpath("//div[@class='word active']/letter")).get(i);
                    String original = letter.getText();
                    wordInput.sendKeys(original);
                }
                wordInput.sendKeys(" ");
            } catch (Exception e) {
                System.out.println("Completed" + e.getMessage());
                break;
            }
        }
    }
}
