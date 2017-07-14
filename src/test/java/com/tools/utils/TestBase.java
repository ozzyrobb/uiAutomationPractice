package com.tools.utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by robb on 14/07/2017.
 */
public class TestBase {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        baseUrl = "http://www.google.com";
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
