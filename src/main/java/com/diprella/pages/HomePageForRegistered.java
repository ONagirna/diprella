package com.diprella.pages;

import static com.diprella.framework.Utils.waitForElementVisibility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;

public class HomePageForRegistered extends BasePage {
	
	public static final String USER_PROFILE_ICON_XPATH = "//a[contains(@class, '-inserted')]";
	public static final String LECTURER_PROFILE_LINK_XPATH = "//a[contains(@class, '-lecturer')]";
	
	@FindBy (xpath = USER_PROFILE_ICON_XPATH)
	public WebElement userProfileIcon;
	
	@FindBy (xpath = LECTURER_PROFILE_LINK_XPATH)
	public WebElement lecturerProfileLink;
	
	public UserDropdownMenu expandUserDropdownMenu() {
		userProfileIcon.click();
		return initPage(UserDropdownMenu.class);
	}
	
	public LecturerDropdownMenu expandLecturerDropdownMenu() {
		waitForElementVisibility(lecturerProfileLink);
		lecturerProfileLink.click();
		return initPage(LecturerDropdownMenu.class);
	}
	
	

}
