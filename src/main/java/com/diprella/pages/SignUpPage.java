package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;
import com.diprella.models.User;

public class SignUpPage extends BasePage {

	@FindBy(xpath = "//input[@formcontrolname='first_name']")
	WebElement firstNameInputField;
	
	@FindBy(xpath = "//input[@formcontrolname='last_name']")
	WebElement lastNameInputField;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement emailInputField;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement passwordInputField;
	
	@FindBy(xpath = "//label[@class='terms']")
	WebElement agreeTermsCheckbox;
	
	@FindBy(xpath = "//button[@type='submit']")
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
