package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by robb on 14/07/2017.
 */
public class GoogleHomePage {

    private String searchFieldLocator = ".gsfi";

    public void enterSearchTerm(String searchTerm) {
        AbstractPage.waitForPageToLoad();
        driver.findElement(By.id(searchFieldLocator)).click();
    }
}
