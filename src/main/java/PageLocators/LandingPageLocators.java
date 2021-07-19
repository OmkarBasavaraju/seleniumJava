package PageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LandingPageLocators {
	
	@FindAll({
	@FindBy(id="#uitk-tabs-button-container > li:nth-child(1)"),
	@FindBy(css="#uitk-tabs-button-container > li:nth-child(2) > a")
	})
	public WebElement clickFlights;

	
	@FindBy(css="#uitk-tabs-button-container > div.uitk-tabs-inner-container > li:nth-child(2) > a > span")
	public WebElement oneWayButton;
	
	@FindBy(css ="#location-field-leg1-origin-menu > div.uitk-field.has-floatedLabel-label.has-icon.has-no-placeholder > button")
	public WebElement fromDropDownButton;
	
	@FindBy(css ="#location-field-leg1-origin")
	public WebElement typeCityField;
	
	@FindBy(xpath="//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[1]/button")
	public WebElement clickCityButton;
	
	@FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
	public WebElement toDropDownButton;
	
	@FindBy(xpath="//*[@id=\"location-field-leg1-destination\"]")
	public WebElement toTypeCityField;
	
	@FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button")   
	public WebElement toClickCityButton;
	
	@FindBy(xpath="//*[@id=\"d1-btn\"]")
	public WebElement calenderButton;
	
	@FindBy(xpath="//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[5]/td[5]/button")
	public WebElement calenderDatesButton;
	
	@FindBy(xpath="//*[@id=\"wizard-flight-tab-oneway\"]/div[2]/div[2]/div/div/div/div/div[2]/div/div[3]/button")
	public WebElement doneButton;
	
	@FindBy(xpath="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/button")
	public WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div[1]/div/div/a[2]")
	public WebElement createAccountButton;
	
	
	@FindBy(xpath = "//*[@id=\"create-account-firstname\"]")
	public WebElement firstNameButton;
	
	@FindBy(xpath = "//*[@id=\"create-account-lastname\"]")
	public WebElement lastNameButton;
	
	
	@FindBy(xpath = "//*[@id=\"create-account-emailId\"]")
	public WebElement emailAddressButton;
	
	
	@FindBy(xpath = "//*[@id=\"create-account-password\"]")
	public WebElement passwordButton;
	
	
	@FindBy(xpath = "//*[@id=\"create-account-confirm-password\"]")
	public WebElement createPasswordButton;
	
	
	@FindBy(xpath = "//*[@id=\"new-user-options\"]/ul/li[2]/fieldset/div/input")
	public WebElement clickConsentCheckbox;
	
	@FindBy(xpath = "//*[@id=\"create-account-submit-button\"]")
	public WebElement createFreeAccountButton;
	
    @FindBy(css = "#uitk-tabs-button-container > li.uitk-tab.uitk-tab-icon-text")
    public List<WebElement> landingPageTabs;
	
}
