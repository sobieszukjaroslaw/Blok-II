package pl.soflab.workshop.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	private By emailCreate = By.xpath("//input[@data-validate='isEmail' and @id='email_create']");
	private By btnCreateAccount = By.xpath("//i[@class='icon-user left']");
	private final String randEmail = randomText + "@" + randomThreeString + "." + randomThreeString; // losowy email 
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
	

}
