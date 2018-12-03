package com.diprella.tests;

import static com.diprella.framework.BasePage.initPage;
import static com.diprella.models.UserData.USER_1;
import static com.diprella.models.UserData.USER_2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import com.diprella.models.User;
import com.diprella.pages.HomePage;
import com.diprella.pages.SignUpPage;

public class SignUpTest extends BaseTest {
	
	private HomePage homePage;
	private SignUpPage signUpPage;
	
	
	@Test(dataProvider = "testData")
	public void openSignUpViaBtnOnHeader(User user) {
		homePage = initPage(HomePage.class);
		signUpPage = homePage.clickSignUpBtnOnHeader();
		signUpPage.fillInSignUpForm(user);
	}
	
  // Trial example of data driven test case. Need to have access to registered users in DB to create dynamically new users with unique emails
	// Multithread is not working now
	@DataProvider(name = "testData")
	public static Object[][] testData() {
		return new Object[][] { { USER_1 }, { USER_2 } };
	}
}
