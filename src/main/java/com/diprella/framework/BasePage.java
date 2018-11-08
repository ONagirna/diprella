package com.diprella.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public static WebDriver driver;
    public static Settings settings;
//    public Actions action = new Actions(driver);
//    public JavascriptExecutor js=(JavascriptExecutor) driver;

	public static <T extends BasePage> T initPage(Class<T> pageClass) {
		return PageFactory.initElements(driver, pageClass);
	}


}
