package com.diprella.framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.diprella.framework.BasePage.driver;
import static com.diprella.framework.BasePage.settings;

import java.net.MalformedURLException;

public class BaseTest {

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws MalformedURLException {
		settings = new Settings();
		driver = settings.getDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(settings.getBaseUrl());
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		driver.quit();
	}

}
