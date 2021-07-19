package Testcases;

import org.testng.annotations.Test;

import Base.Base;
import Page.CreateAccount;
import Page.LandingPage;

public class LandingPageTestCases {
	
	@Test
	public static void landingPageTestCases_01() throws InterruptedException {
	Base.iniConfigaration();
	LandingPage landingpage = new LandingPage();
	Base.Assertion.assertEquals(landingpage.verifyTabs(), 6);
//	Assert.assertEquals(landingpage.verifyTabs(), 7);
	landingpage.navigatetoFlightPage().fromLocationFlight().toLocationFlight();
	Base.Assertion.assertAll();
	landingpage.tearDown();
	}
	
	@Test
	public void createAccountTestcase() {
		Base.iniConfigaration();
		CreateAccount account = new CreateAccount();
		account.createAccount();
	}
}
