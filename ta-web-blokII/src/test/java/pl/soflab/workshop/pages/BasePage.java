package pl.soflab.workshop.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	protected String randomText = RandomStringUtils.randomAlphabetic(8); //losowy ciąg 8 znaków
	protected String randomThreeString = RandomStringUtils.randomAlphabetic(3); //losowy ciąg 3 znaków	
	protected String randomZipCode = RandomStringUtils.randomNumeric(5); //losowy adres pocztowy
	protected String randomMobilePhone = RandomStringUtils.randomNumeric(9); // losowy numer
	protected WebDriverWait wait;
	protected Actions action;
	protected WebElement element;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	protected void click(By location) {
		driver.findElement(location).click();
		
	}
	protected void click(WebElement weElement) { 
		weElement.click();
	}
	protected void setTextField(By location, String value) {
		driver.findElement(location).sendKeys(value);
	}
	protected void setTextField(WebElement weElement, String value) {
		weElement.sendKeys(value);
	}
	protected void waitForElement(By location) {  //metoda do oczekiwania aż element na stronie zostanie wczytany
		wait = new WebDriverWait(driver,10); 
		element = wait.until(ExpectedConditions.presenceOfElementLocated(location));
	}
	protected void waitForElementClicable(By location) {  //metoda do oczekiwania aż element na stronie zostanie wczytany i możliwy do kliknięcia
		wait = new WebDriverWait(driver,10); 
		element = wait.until(ExpectedConditions.elementToBeClickable(location));
	}
	protected void waitForElementVisibility(By location) {  //metoda do oczekiwania aż element na stronie zostanie wczytany i możliwy do kliknięcia
		wait = new WebDriverWait(driver,10); 
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(location));
	}
	protected void navigateToElement(WebElement location) {
		action = new Actions(driver);
		action.moveToElement(location).build().perform();
	}
	protected void selectElement(By location, String value) {
		driver.findElement(location).sendKeys(value);
	}
	
}
