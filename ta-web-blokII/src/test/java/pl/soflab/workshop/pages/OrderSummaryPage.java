package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage extends BasePage {
	
	private By weBtnConfirmOrder = By.xpath("//button/span[text() = 'I confirm my order']");

	public OrderSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public OrderConfirmationPage clickConfirmMyOrder() {
		waitForElementClicable(weBtnConfirmOrder);
		click(weBtnConfirmOrder);
		return new OrderConfirmationPage(driver);
	}
}
