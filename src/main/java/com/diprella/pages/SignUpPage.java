package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;
import com.diprella.models.User;

public class SignUpPage extends BasePage {
	
	public static final String FIRST_NAME_INPUT_XPATH = "//input[@formcontrolname='first_name']";
	public static final String LAST_NAME_INPUT_XPATH = "//input[@formcontrolname='last_name']";
	public static final String EMAIL_INPUT_XPATH = "//input[@formcontrolname='email']";
	public static final String PASSWORD_INPUT_XPATH = "//input[@formcontrolname='password']";
	public static final String AGREE_TERMS_CHECKBOX_XPATH = "//label[@class='terms']";
	public static final String SUBMIT_BUTTON_XPATH = "//button[@type='submit']";
	
	@FindBy(xpath = FIRST_NAME_INPUT_XPATH)
	WebElement firstNameInputField;
	
	@FindBy(xpath = LAST_NAME_INPUT_XPATH)
	WebElement lastNameInputField;
	
	@FindBy(xpath = EMAIL_INPUT_XPATH)
	WebElement emailInputField;
	
	@FindBy(xpath = PASSWORD_INPUT_XPATH)
	WebElement passwordInputField;
	
	@FindBy(xpath = AGREE_TERMS_CHECKBOX_XPATH)
	WebElement agreeTermsCheckbox;
	
	@FindBy(xpath = SUBMIT_BUTTON_XPATH)
	WebElement submitButton;
	
	
	public HomePageForRegistered doSignUp(User user) {
		enterFirstname(user.getFirstname());
		enterLastname(user.getLastname());
		enterEmail(user.getEmail());
		enterPassword(user.getPassword());
		getAgreeTermsCheckbox().click();
		getSumbitButton().click();
		return initPage(HomePageForRegistered.class);
	}
	
	public void enterFirstname(String firstname) {
		firstNameInputField.clear();
		firstNameInputField.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		lastNameInputField.clear();
		lastNameInputField.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		emailInputField.clear();
		emailInputField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordInputField.clear();
		passwordInputField.sendKeys(password);
	}
	
	public WebElement getAgreeTermsCheckbox() {
		return agreeTermsCheckbox;
	}
	
	public WebElement getSumbitButton() {
		return submitButton;
	}

}
