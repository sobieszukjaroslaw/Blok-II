package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountCreation extends BasePage {
	private By weradioButton = By.id("id_gender1");
	private By weFirstName = By.id("customer_firstname");
	private By weLastName = By.id("customer_lastname");
	private By wePassword = By.id("passwd");
	private By weDateOfBirth = By.id("days");
	private By weMonthOfBirth = By.id("months");
	private By weYearOfBirth = By.id("years");
	private By weCheckboxNewsletter = By.id("newsletter");
	private By weCheckboxSpecialOffers = By.id("optin");
	private By weCity = By.id("city");
	private By weCompany = By.id("company");
	private By weAdress = By.id("address1");
	private By weState = By.id("id_state");
	private By weZipCode = By.id("postcode");
	private By weAlias = By.id("alias");
	private By weMobilePhone = By.id("phone_mobile");
	private By weBtnRegister = By.xpath("//span[text()= 'Register']");
	
	public AccountCreation(WebDriver driver) {
		super(driver);
	}
	
	public void selectGender() {
		waitForElement(weradioButton);
		click(element);
	}
	public void fillName() {
		waitForElement(weFirstName);
		setTextField(element, randomText);
	}
	public void fillLastName() {
		waitForElement(weLastName);
		setTextField(element, randomText);
	}
	public void fillPassword() {
		waitForElement(wePassword);
		setTextField(element, randomText);
	}
	public void setDayOfBirth(String day) {
		waitForElement(weDateOfBirth);
		//navigateToElement(element);
		click(element);
		selectElement(weDateOfBirth,day);
		click(weDateOfBirth);
	}
	public void setMonthOfBirth(String month) {
		waitForElement(weMonthOfBirth);
		click(element);
		selectElement(weMonthOfBirth, month);
		click(weMonthOfBirth);
	}
	public void setYearOfBirth(String year) {
		waitForElement(weYearOfBirth);
		click(element);
		selectElement(weYearOfBirth, year);
		click(weYearOfBirth);
	}
	public void clickCheckboxNewsletters() {
		click(weCheckboxNewsletter);
	}
	public void clickCheckboxSpecialOffers() {
		click(weCheckboxSpecialOffers);
	}
	
	public void fillCompany() {
		waitForElement(weCompany);
		setTextField(element, randomText);
	}
	
	public void fillCity() {
		waitForElement(weCity);
		setTextField(element, randomText);
	}
	public void fillAdress() {
		waitForElement(weAdress);
		setTextField(element, randomText);
	}
	public void setState(String state) {
		waitForElement(weState);
		click(element);
		selectElement(weState, state);
		click(weState);
	}
	public void fillZipCode() {
		waitForElement(weZipCode);
		setTextField(element, randomZipCode);
	}
	public void fillMobilePhone() {
		waitForElement(weMobilePhone);
		setTextField(element, randomMobilePhone);
	}
	public void fillAlias() {
		waitForElement(weAlias);
		element.clear();
		setTextField(element, randomText);
	}
	public MyAccount clickBtbRegister() {
		click(weBtnRegister);
		return new MyAccount(driver);
	}
}
