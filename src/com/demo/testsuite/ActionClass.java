package com.demo.testsuite;

import org.testng.annotations.Test;

import com.demo.common.BaseTestCase;
import com.demo.pages.HomePage;
import com.demo.utilities.utilities;

public class ActionClass extends BaseTestCase{

	@Test
	public void testActionClass() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		
		utilities.ScrollInViewByJS(driver, homePage.linkDynamicID);
		
		utilities.clickByActionClass(driver, homePage.linkDynamicID);
		
		Thread.sleep(10000);
	}
	
	public void testMethod() {
		
	}

}
