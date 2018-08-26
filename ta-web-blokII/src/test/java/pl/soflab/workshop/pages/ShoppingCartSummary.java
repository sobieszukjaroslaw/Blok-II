package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummary extends BasePage {
	private By weProceedBtn = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");

	public ShoppingCartSummary(WebDriver driver) {
		super(driver);
	}
	public SignInPage signInPage() {
		waitForElementClicable(weProceedBtn);
		click(weProceedBtn);
		return new SignInPage(driver);
	}

}
