package com.diprella.framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.diprella.framework.BasePage.driver;
import static com.diprella.framework.BasePage.settings;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

	@BeforeSuite(alwaysRun = true)
    public void beforeSuite() throws MalformedURLException {
        settings = new Settings();
        driver = settings.getDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(settings.getBaseUrl());
    }
	
    @AfterSuite(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
}
