package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.diprella.framework.BasePage;

import static com.diprella.framework.Utils.waitForElementVisibility;

public class LecturerDropdownMenu extends BasePage {

	public static final String COURSES_SETTINGS_OPTION_XPATH = "//div[@class='instructor__item']/a[@routerlink='/courses-management']";
	public static final String CREATE_COURSE_OPTION_XPATH = "//div[@class='instructor__item']//a[@routerlink='/create-course']";

	@FindBy(xpath = COURSES_SETTINGS_OPTION_XPATH)
	public WebElement coursesSettingsOption;

	@FindBy(xpath = CREATE_COURSE_OPTION_XPATH)
	public WebElement createCourseOption;

	public CoursesSettingsPage clickOnCoursesSettingsOption() {
		waitForElementVisibility(COURSES_SETTINGS_OPTION_XPATH);
		coursesSettingsOption.click();
		return initPage(CoursesSettingsPage.class);
	}

	public CreateCourseFirstPage clickOnCreateCourseOption() {
		waitForElementVisibility(CREATE_COURSE_OPTION_XPATH);
		createCourseOption.click();
		return initPage(CreateCourseFirstPage.class);
	}

}
