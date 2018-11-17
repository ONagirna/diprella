package com.diprella.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class Settings {

	public static String baseUrl = "https://demo.diprella.com/";

	public WebDriver getDriver() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		ChromeDriverManager.getInstance().setup();
		return new ChromeDriver(options);
	}

	public String getBaseUrl() {
		return baseUrl;
	}
}