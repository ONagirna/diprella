package com.diprella.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Settings {

	public static String baseUrl = "https://diprella.com/";

	public WebDriver getDriver() throws MalformedURLException {
		ChromeDriverManager.getInstance().setup();
		return new ChromeDriver();
	}

	public String getBaseUrl() {
		return baseUrl;
	}
}