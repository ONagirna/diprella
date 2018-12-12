package com.diprella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import com.diprella.framework.BasePage;

public class CoursesSettingsPage extends BasePage {
	
	public static final String COURSES_GROUPS_TABS_XPATH = "//a[contains(@class, 'nav__link')]";
	
	@FindBy (xpath = COURSES_GROUPS_TABS_XPATH)
	public List<WebElement> coursesGropusTabs; 


}
