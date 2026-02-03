package org.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseFiles.NinjaTutorialsBase;

public class TestOne extends NinjaTutorialsBase {

	@BeforeSuite
	public void launch() {
		optBrowser("one");
	}
	private final Logger logger = LoggerFactory.getLogger(TestOne.class);
	@Test
	public void testName() throws Exception {
		logger.info("hellos");
//		homePage.clickSpecificTab("My Account");
		homePage.clickSpecificTabWithinDropdown("My Account","Register");
		takeScreenShot("hellos1234");
		
	}
}
