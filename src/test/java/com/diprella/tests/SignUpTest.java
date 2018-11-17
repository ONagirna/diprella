package com.diprella.tests;

import static com.diprella.framework.BasePage.initPage;

import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import com.diprella.pages.HomePage;
import com.diprella.pages.SignUpPage;

public class SignUpTest extends BaseTest {
	
	private HomePage homePage;
	private SignUpPage signUpPage;
	
	@Test
	public void openSignUpViaBtnOnHeader() {
		homePage = initPage(HomePage.class);
		signUpPage = homePage.clickSignUpBtnOnHeader();
	}
	
  
}
