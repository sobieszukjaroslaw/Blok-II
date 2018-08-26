package pl.soflab.workshop.pages;

import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BasePage {

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
	}
	public String checkTitle() {
		return driver.getTitle();
	}

}
