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
	
	public AccountCreation(WebDriver driver) {
		super(driver);
	}
	
	public void selectGender() {
		wait = new WebDriverWait(driver,10); 
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weradioButton));
		click(element);
	}
	public void fillName() {
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weFirstName));
		setTextField(element, randomText);
	}
	public void fillLastName() {
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weLastName));
		setTextField(element, randomText);
	}
	public void fillPassword() {
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(wePassword));
		setTextField(element, randomText);
	}
	public void setDayOfBirth(String day) {
		wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weDateOfBirth));
		//navigateToElement(element);
		click(element);
		selectElement(weDateOfBirth,day);
		click(weDateOfBirth);
	}
	public void setMonthOfBirth(String month) {
		wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weMonthOfBirth));
		click(element);
		selectElement(weMonthOfBirth, month);
		click(weMonthOfBirth);
	}
	public void setYearOfBirth(String year) {
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weYearOfBirth));
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
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weCompany));
		setTextField(element, randomText);
	}
	
	public void fillCity() {
		wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(weCity));
		setTextField(element, randomText);
	}
	public void fillAdress() {
		
	}

}
