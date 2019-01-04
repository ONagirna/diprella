package com.diprella.tests;

import static com.diprella.framework.BasePage.initPage;
import static com.diprella.framework.Utils.isElementDisplayed;
import static com.diprella.framework.Utils.waitForElementAndClick;
import static com.diprella.pages.HomePageForRegistered.LECTURER_PROFILE_LINK_XPATH;
import static com.diprella.pages.HomePageForRegistered.USER_PROFILE_ICON_XPATH;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import com.diprella.pages.CoursesSettingsPage;
import com.diprella.pages.CreateCourseFirstPage;
import com.diprella.pages.HomePageForNonRegistered;
import com.diprella.pages.HomePageForRegistered;
import com.diprella.pages.LecturerDropdownMenu;
import com.diprella.pages.SignInPage;
import com.diprella.pages.UserDropdownMenu;

public class CreateCourseTest extends BaseTest {

	private HomePageForNonRegistered homePageNonRegistered;
	private SignInPage signInPage;
	private HomePageForRegistered homePageRegistered;
	private LecturerDropdownMenu lecturerDropdownMenu;
	private CoursesSettingsPage coursesSettingsPage;
	private UserDropdownMenu userDropdownMenu;
	private HomePageForRegistered homePageForRegistered;
	private CreateCourseFirstPage createCourseFirstPage;

	@BeforeClass(alwaysRun = true)
	public void doValidSignIn() {
		homePageNonRegistered = initPage(HomePageForNonRegistered.class);
		signInPage = homePageNonRegistered.openSignInFormByClickOn(homePageNonRegistered.signInLinkInHeader);
		homePageRegistered = signInPage.doSignIn("oksavchenkova+1@gmail.com", "testPassword1");
	}
	
	@Test
	public void openFirstCourseCreationPage() {
		lecturerDropdownMenu = homePageRegistered.expandLecturerDropdownMenu();
		createCourseFirstPage = lecturerDropdownMenu.clickOnCreateCourseOption();
		assertTrue(isElementDisplayed(createCourseFirstPage.aboutCourseHeader));
		

	    
	    System.out.println(createCourseFirstPage.isRadiobuttonChecked(createCourseFirstPage.privateAccessRadiobutton));
	    
	}

	    @Test(dependsOnMethods="openFirstCourseCreationPage")
	    public void selectPrivateAccessModificator() {
	    	waitForElementAndClick( createCourseFirstPage.privateAccessRadiobutton);
	    	createCourseFirstPage.languageField.click();
	    	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	createCourseFirstPage.languageFilterInput.sendKeys("English");
	    	
	    }
//	@Test
//	public void openCourseSettingsPage() {
//		lecturerDropdownMenu = homePageRegistered.expandLecturerDropdownMenu();
//		coursesSettingsPage = lecturerDropdownMenu.clickOnCoursesSettingsOption();
//		for (WebElement tab : coursesSettingsPage.coursesGropusTabs) {
//			assertTrue(tab.isDisplayed(), "The tabs for groups of courses should be available on the Courses Settings page");
//		}
//	}
	
//	@AfterClass(alwaysRun=true)
//	public void doSignOutIfNeeded() {
//			if (isElementPresent(USER_PROFILE_ICON_XPATH) || isElementPresent(LECTURER_PROFILE_LINK_XPATH)) {
//			homePageForRegistered = initPage(HomePageForRegistered.class);
//			userDropdownMenu = homePageForRegistered.expandUserDropdownMenu();
//			homePageNonRegistered = userDropdownMenu.doSignOut();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	

}
