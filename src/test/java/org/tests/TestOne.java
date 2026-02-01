package org.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestOne {

	private final Logger logger = LoggerFactory.getLogger(TestOne.class);
	@Test
	public void testName() throws Exception {
		logger.info("hellos");
		
	}
}
