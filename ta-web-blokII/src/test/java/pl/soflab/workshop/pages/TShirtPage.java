package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtPage extends BasePage {
	private By weImage = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
	private By weAddToCart = By.xpath("//span[text()='Add to cart']");
	private By weBtnProceedToCheckOut = By.xpath("//a [@title = 'Proceed to checkout']");
	
	public TShirtPage(WebDriver driver) {
		super(driver);
	}
	public void navigateToTShirt() {
		waitForElement(weImage);
		navigateToElement(element);
	}
	public TShirtPage clickAddToCart() {
		click(weAddToCart);
		return this;
	}
	public TShirtPage waitForElement() {
		waitForElementVisibility(weBtnProceedToCheckOut);
		waitForElementClicable(weBtnProceedToCheckOut);
		return this;
	}
	public ShoppingCartSummary clickProceedToCheckout() {
		click(weBtnProceedToCheckOut);
		return new ShoppingCartSummary(driver);
	}
}
