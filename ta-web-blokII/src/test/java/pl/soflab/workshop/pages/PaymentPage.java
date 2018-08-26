package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
	private By wePayBycheck = By.xpath("//a[@title='Pay by check.']");

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	public OrderSummaryPage clickPayByCheck() {
		waitForElementClicable(wePayBycheck);
		click(wePayBycheck);
		return new OrderSummaryPage(driver);
	}
}
