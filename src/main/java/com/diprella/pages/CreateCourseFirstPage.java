package com.diprella.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;

public class CreateCourseFirstPage extends BasePage {
	
	public static final String SKILLS_INPUT_FIELD_XPATH = "//input[@class='autocomplete__field']";
	
	public static final String UPLOAD_VIDEO_TRAILER_BUTTON_XPATH = "//input[@accept='video/*']/parent::span";
	public static final String UPLOAD_IMAGE_COVER_BUTTON_XPATH = "//input[@accept='image/*']/parent::span";
	
	public static final String LIST_OF_INDUSTRIES_OPTIONS_XPATH = "//app-industries-checkbox-item";
	
	public static final String NO_LEVEL_CHECKBOX_XPATH = "//label[@for='no_level']";
	public static final String LEVEL_ADVENCED_BUTTON_XPATH = "//label[@for='Advanced']";
	public static final String LEVEL_INTERMEDIATE_BUTTON_XPATH = "//label[@for='Intermediate']";
	public static final String LEVEL_BEGINNER_BUTTON_XPATH = "//label[@for='Beginner']";
	
	public static final String LANGUAGE_FILTER_LIST_OF_LANGUAGES_XPATH = "//ul[contains(@class, 'ui-dropdown-items')]//li";
	public static final String LANGUAGE_FILTER_INPUT_XPATH = "//input[contains(@class, 'ui-dropdown-filter ')]";
	public static final String LANGUAGE_FIELD_XPATH = "//app-select-language";
	
	public static final String PRIVATE_RADIOBUTTON_XPATH = "//input[@value='private']/following-sibling::label";
	public static final String PUBLIC_RADIOBUTTON_XPATH = "//input[@value='public']/following-sibling::label";
	public static final String PROTECTED_RADIOBUTTON_XPATH = "//input[@value='protected']/following-sibling::label";
	
	public static final String COURSE_TITLE_INPUT_XPATH = "//input[contains(@class,'title__input')]";
	public static final String ABOUT_COURSE_HEADER_XPATH = "//h1[contains(@class,'about')]";

	
	@FindBy(xpath = LANGUAGE_FILTER_LIST_OF_LANGUAGES_XPATH)
	public List<WebElement> languageFilterList;
	
	@FindBy(xpath = LANGUAGE_FILTER_INPUT_XPATH)
	public WebElement languageFilterInput;
	
	@FindBy(xpath = LANGUAGE_FIELD_XPATH)
	public WebElement languageField;
	
	@FindBy(xpath = COURSE_TITLE_INPUT_XPATH)
	public WebElement courseTitleInputField;
	
	@FindBy(xpath = ABOUT_COURSE_HEADER_XPATH)
	public WebElement aboutCourseHeader;
	
	@FindBy(xpath = PRIVATE_RADIOBUTTON_XPATH)
	public WebElement privateAccessRadiobutton;
	
	@FindBy(xpath = PUBLIC_RADIOBUTTON_XPATH)
	public WebElement publicAccessRadiobutton;
	
	@FindBy(xpath = PROTECTED_RADIOBUTTON_XPATH)
	public WebElement protectedAccessRadiobutton;
	
	public boolean isRadiobuttonChecked (WebElement element) {
		return privateAccessRadiobutton.getCssValue("border").contains("8px"); 
	}
}
