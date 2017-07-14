package com.cucumber.pages;

import com.tools.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


/**
 * Created by robb on 14/07/2017.
 */
public class AbstractPage {
    protected static void waitForPageToLoad() {
//        int retry = 0;
//        String response = "";
//        do {
            try {
                Thread.sleep(Constants.WAIT_TIME_CONSTANT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            response = String.valueOf(((JavascriptExecutor) getDriver()).executeScript("return document.readyState"));
//            retry++;
//        } while (retry <= Constants.PAGE_LOAD_MAX_RETRY && response.equals("complete") != true);
    }
}
