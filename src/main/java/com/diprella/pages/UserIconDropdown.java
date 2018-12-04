package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;

public class UserIconDropdown extends BasePage {

	public static final String SIGNOUT_FROM_DROPDOWN_OPTOPN_XPATH = "//section[@class='user__dropdown__wrapper ng-star-inserted']//a[4]";

	@FindBy(xpath = SIGNOUT_FROM_DROPDOWN_OPTOPN_XPATH)
	public WebElement signOutOptionInDropdown;

	public HomePageForNonRegistered doSignOut() {
		signOutOptionInDropdown.click();
		return initPage(HomePageForNonRegistered.class);

	}

}
