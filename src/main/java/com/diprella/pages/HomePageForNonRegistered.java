package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.diprella.framework.BasePage;

import static com.diprella.framework.Utils.waitForElementVisibility;

public class HomePageForNonRegistered extends BasePage {

	public static final String SIGNUP_BTN_START_TEACHING_ON_BANNER_XPATH = "//div[@class='banner__container']//span[@class='lecturer']";
	public static final String SIGNUP_BTN_START_LEARNING_ON_BANNER_XPATH = "//div[@class='banner__container']//span[@class='student']";
	public static final String SIGNUP_BTN_ON_HEADER_XPATH = "//div[@class='header__nav-button']";
	public static final String SIGNIN_BTN_ON_HEADER_XPATH = "//a[@class='header__nav-link']";

	@FindBy(xpath = SIGNUP_BTN_START_TEACHING_ON_BANNER_XPATH)
	public WebElement signUpStartTeachingBtnOnBanner;
	
	@FindBy(xpath = SIGNUP_BTN_START_LEARNING_ON_BANNER_XPATH)
	public WebElement signUpStartLearningBtnOnBanner;

	@FindBy(xpath = SIGNUP_BTN_ON_HEADER_XPATH)
	public WebElement signUpBtnInHeader;

	@FindBy(xpath = SIGNIN_BTN_ON_HEADER_XPATH)
	public WebElement signInLinkInHeader;

	public SignUpPage openSignUpFormByClickOn(WebElement button) {
		waitForElementVisibility(button);
		button.click();
		return initPage(SignUpPage.class);
	}

	public SignInPage openSignInFormByClickOn(WebElement button) {
		waitForElementVisibility(button);
		button.click();
		return initPage(SignInPage.class);
	}

}
