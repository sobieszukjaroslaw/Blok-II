package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage extends BasePage {
	
	private By weCheckbox = By.xpath("//input[@id = 'cgv']");
	private By weProceedToCheckout = By.xpath("//button[@name='processCarrier']");
	public ShippingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public ShippingPage clickCheckbox() {
		click(weCheckbox);
		return this;
	}
	public PaymentPage clickProceedToCheckout() {
		waitForElementClicable(weProceedToCheckout);
		click(weProceedToCheckout);
		return new PaymentPage(driver);
	}
}
