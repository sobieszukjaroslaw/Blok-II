package pl.soflab.workshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	private By emailCreate = By.xpath("//input[@data-validate='isEmail' and @id='email_create']");
	private By btnCreateAccount = By.xpath("//i[@class='icon-user left']");
	private By weEmailLogin = By.id("email");
	private By wePassword = By.id("passwd");
	private By weSignIn = By.xpath("//i[@class='icon-lock left']");
	protected final String randEmail = randomText + "@" + randomThreeString + "." + randomThreeString; // losowy email 
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void setEmailAdress() {
		setTextField(emailCreate,randEmail );
	}
	public AccountCreation clickBtnCreationAccount() { 
		click(btnCreateAccount);
		return new AccountCreation(driver);
	}
	public void fillLoginEmail(String login) {
		setTextField(weEmailLogin, login);
	}
	public void fillPassword(String password) {
		setTextField(wePassword, password);
	}
	public MyAccount clickLogin() {
		click(weSignIn);
		return new MyAccount(driver);
	}

}
