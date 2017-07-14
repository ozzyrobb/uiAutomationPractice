package com.cucumber.pages;

/**
 * Created by robb on 14/07/2017.
 */
public class GoogleHomePage {

    private String searchFieldLocator = ".gsfi";

    public void enterSearchTerm() {
        AbstractPage.waitForPageToLoad();

    }
}
