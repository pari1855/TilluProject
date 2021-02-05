package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.landingPage;
import Utility.BaseClass;

public class landingPage_TC extends BaseClass{

	@BeforeMethod
	public void setUp() throws Exception {
		driverInitialization();
	}
	@Test
	public void clickOnDropZone() {
		landingPage obj = new landingPage();
		obj.clickOnDZ();
	}
}
