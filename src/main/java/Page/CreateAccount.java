package Page;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Base;
import PageLocators.LandingPageLocators;

public class CreateAccount extends Base {

	public static LandingPageLocators landingPage;

	public CreateAccount() {
		landingPage = new LandingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, landingPage);
	}

	public void createAccount() {
		landingPage.signInButton.click();
		landingPage.createAccountButton.click();
		landingPage.firstNameButton.sendKeys("keerthi");
		landingPage.lastNameButton.sendKeys("D L");
		landingPage.emailAddressButton.sendKeys("keerthitdfzzxrsddvy@gmail.com");
		landingPage.passwordButton.sendKeys("tesdzrc@123yt");
		landingPage.createPasswordButton.sendKeys("tesdzrc@123yt");
		landingPage.clickConsentCheckbox.click();
		landingPage.createFreeAccountButton.click();
		
	}

}

