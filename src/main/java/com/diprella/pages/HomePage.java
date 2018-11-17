package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.diprella.framework.BasePage;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[@class='header__nav-button']")
	WebElement signUpBtnInHeader;
	
	@FindBy(xpath = "//a[@class='header__nav-link']")
	WebElement signInLinkInHeader;
	
	
	public SignUpPage clickSignUpBtnOnHeader() {
		signUpBtnInHeader.click();
		return initPage(SignUpPage.class);
		
	}
}
