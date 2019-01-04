package com.diprella.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import static com.diprella.framework.BasePage.driver;

public class Utils {
	
	
	public static void waitForElementAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public static void waitForElementVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	
	}

	public static void waitForElementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForAllElementsVisibility(List<WebElement> list) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfAllElements(list));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForElementInvisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}

	public static boolean isElementPresent(String xpath) {
		return driver.findElements(By.xpath(xpath)).size() > 0;
	}

	public static boolean isElementDisplayed(WebElement element) {
		waitForElementVisibility(element);
		try { element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static WebElement getElementAfterWait(WebElement element) {
		waitForElementVisibility(element);
		return element;
	}

	
	public static void waitForElementStaleness(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
	}
	
	

}
