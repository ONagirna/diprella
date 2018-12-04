package com.diprella.tests;

import static com.diprella.framework.BasePage.initPage;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.UUID;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import com.diprella.models.User;
import com.diprella.pages.HomePageForNonRegistered;
import com.diprella.pages.HomePageForRegistered;
import com.diprella.pages.SignUpPage;
import com.diprella.pages.UserIconDropdown;
import static com.diprella.framework.Utils.waitForElementVisibility;

public class SignUpTest extends BaseTest{

	private HomePageForNonRegistered homePageNonRegistered;
	private HomePageForRegistered homePageRegistered;
	private SignUpPage signUpPage;
	private UserIconDropdown userIconDropdown;
	String randomEmail;
	
	@BeforeMethod(alwaysRun = true)
	public void openHomePage() throws MalformedURLException {
		homePageNonRegistered = initPage(HomePageForNonRegistered.class);
		randomEmail = "random-" + UUID.randomUUID().toString() + "@gmail.com";
	    }


	@Test
	public void signUpAfterClickBtnOnHeader() {
		signUpPage = homePageNonRegistered.openSignUpFormByClickOn(homePageNonRegistered.signUpBtnInHeader);
		homePageRegistered = signUpPage.doSignUp(new User("Oksana", "Testivna", randomEmail, "randomPassword"));
		waitForElementVisibility(homePageRegistered.userProfileIcon);
		assertTrue(homePageRegistered.userProfileIcon.isDisplayed(),
				"User profile icon should be displayed in top right corner after user has signed up");
	}

	@Test
	public void signUpAfterClickStartLearningOnBanner() {
		signUpPage = homePageNonRegistered.openSignUpFormByClickOn(homePageNonRegistered.signUpStartLearningBtnOnBanner);
		homePageRegistered = signUpPage.doSignUp(new User("Oksana", "Testivna", randomEmail, "randomPassword"));
		waitForElementVisibility(homePageRegistered.userProfileIcon);
		assertTrue(homePageRegistered.userProfileIcon.isDisplayed(),
				"User profile icon should be displayed in top right corner after user has signed up");
	}

	@Test
	public void signUpAfterClickStartTeachingOnBanner() {
		signUpPage = homePageNonRegistered.openSignUpFormByClickOn(homePageNonRegistered.signUpStartTeachingBtnOnBanner);
		homePageRegistered = signUpPage.doSignUp(new User("Oksana", "Testivna", randomEmail, "randomPassword"));
		waitForElementVisibility(homePageRegistered.userProfileIcon);
		assertTrue(homePageRegistered.userProfileIcon.isDisplayed(),
				"User profile icon should be displayed in top right corner after user has signed up");
	}
	

    @AfterMethod(alwaysRun = true)
    public void doSignOut() {
        userIconDropdown = homePageRegistered.expandUserIconDropdown();
        userIconDropdown.doSignOut();
    }
}
