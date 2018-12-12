package com.diprella.tests;

import static com.diprella.framework.BasePage.initPage;
import static com.diprella.framework.Utils.waitForElementVisibility;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import com.diprella.pages.HomePageForNonRegistered;
import com.diprella.pages.HomePageForRegistered;
import com.diprella.pages.SignInPage;
import com.diprella.pages.UserDropdownMenu;

public class SignInTest extends BaseTest {

	private HomePageForNonRegistered homePageNonRegistered;
	private SignInPage signInPage;
	private HomePageForRegistered homePageRegistered;
	private UserDropdownMenu userDropdownMenu;

	@Test
	public void signInAfterClickBtnOnHeader() {
		homePageNonRegistered = initPage(HomePageForNonRegistered.class);
		signInPage = homePageNonRegistered.openSignInFormByClickOn(homePageNonRegistered.signInLinkInHeader);
		homePageRegistered = signInPage.doSignIn("oksavchenkova+1@gmail.com", "testPassword1");
		waitForElementVisibility(homePageRegistered.userProfileIcon);
		assertTrue(homePageRegistered.userProfileIcon.isDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void doSignOutIfNeeded() {
		userDropdownMenu = homePageRegistered.expandUserDropdownMenu();
		homePageNonRegistered = userDropdownMenu.doSignOut();
		waitForElementVisibility(homePageNonRegistered.signInLinkInHeader);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
