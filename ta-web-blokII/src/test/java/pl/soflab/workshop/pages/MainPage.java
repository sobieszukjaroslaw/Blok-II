package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
	
	private By signInLink = By.xpath("//a[@class='login']");
	private By weTShirtBtn = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
	public MainPage(WebDriver driver) {
		super(driver);
		driver.get("http://automationpractice.com/index.php");
	}
	public LoginPage clickSignIn() {
		click(signInLink);
		return new LoginPage(driver);
	}
	public TShirtPage clickTShirt() {
		click(weTShirtBtn);
		return new TShirtPage(driver);
	}
	
}
