package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdressPage extends BasePage {
	
	private By weBtnProceedToCheckOut = By.xpath("//button[@name='processAddress']");

	public AdressPage(WebDriver driver) {
		super(driver);

	}
	public ShippingPage clickProceedToCheckOut() {
		waitForElementClicable(weBtnProceedToCheckOut);
		click(weBtnProceedToCheckOut);
		return new ShippingPage(driver);
	}
}
