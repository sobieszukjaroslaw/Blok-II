package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
	private By weEmail = By.xpath("//input[@data-validate='isEmail' and @name='email']");
	private By wePasswd = By.xpath("//input[@name='passwd']");
	private By weBtnSignIn = By.id("SubmitLogin");
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	public SignInPage fillEmail(String value) {
		setTextField(weEmail, value);
		return this;
	}
	public SignInPage fillPassword(String value) {
		setTextField(wePasswd, value);
		return this;
	}
	public AdressPage clickSignInButton() {
		click(weBtnSignIn);
		return new AdressPage(driver);
	}
}
