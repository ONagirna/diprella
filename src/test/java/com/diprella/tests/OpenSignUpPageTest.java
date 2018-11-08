package com.diprella.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.diprella.framework.BaseTest;
import static com.diprella.framework.Settings.baseUrl;
import static com.diprella.framework.BasePage.driver;

public class OpenSignUpPageTest extends BaseTest {
	
	@Test
	public void  testTest() {
		
		assertEquals(driver.getCurrentUrl(), baseUrl);
	}
	
  
}
