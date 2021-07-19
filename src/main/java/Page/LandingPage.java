package Page;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Base.Base;
import PageLocators.LandingPageLocators;

public class LandingPage extends Base {
	public static LandingPageLocators PageLocators;
	public WebElement element;

	public LandingPage() {
		System.out.println("Test");
		PageLocators = new LandingPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, PageLocators);
		System.out.println("TestOn");
	}

	public LandingPage navigatetoFlightPage() {
		PageLocators.clickFlights.click();
		return this;
	}

	public LandingPage fromLocationFlight() throws InterruptedException {
		PageLocators.oneWayButton.click();
		PageLocators.fromDropDownButton.click();
		PageLocators.typeCityField.sendKeys("Mysore");
		Thread.sleep(3000);
		PageLocators.clickCityButton.click();
		return this;
	}

	public static void scroll(WebElement element) {
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		Actions action = new Actions(driver);
		action.dragAndDropBy(element, x, y);
	}

	public static void toLocationFlight() throws InterruptedException {
		PageLocators.toDropDownButton.click();
		PageLocators.toTypeCityField.sendKeys("Bangalore");
		PageLocators.toClickCityButton.click();
		PageLocators.calenderButton.click();
		PageLocators.calenderDatesButton.click();
		Thread.sleep(4000);
		LandingPage.scroll(PageLocators.doneButton);
		PageLocators.doneButton.click();
		PageLocators.searchButton.click();
	}
	
	public int verifyTabs() {
		return PageLocators.landingPageTabs.size();
	}
}
