package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;

public class HomePageForRegistered extends BasePage {
	
	public static final String USER_PROFILE_ICON_XPATH = "//a[contains(@class, '-inserted')]";
	
	@FindBy (xpath = USER_PROFILE_ICON_XPATH)
	public WebElement userProfileIcon;
	
	public UserIconDropdown expandUserIconDropdown() {
		userProfileIcon.click();
		return initPage(UserIconDropdown.class);
	}
	
	

}
