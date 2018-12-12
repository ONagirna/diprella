package com.diprella.pages;

public class SignInPage extends SignUpPage {

	public HomePageForRegistered doSignIn(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		getSumbitButton().click();
		return initPage(HomePageForRegistered.class);
	}
}
