package pl.soflab.workshop.pages;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected WebDriver driver;
	protected String randomText = RandomStringUtils.randomAlphabetic(8);
	protected String randomThreeString = RandomStringUtils.randomAlphabetic(3);
	//protected RandomUtils rand = new RandomUtils().nextInt(0,10);
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
	/*protected void waitForElement(By location) {
		wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.elementToBeClickable(location));
	}*/
	protected void navigateToElement(WebElement location) {
		action = new Actions(driver);
		action.moveToElement(location).build().perform();
	}
	protected void selectElement(By location, String value) {
		driver.findElement(location).sendKeys(value);
	}
	
}
