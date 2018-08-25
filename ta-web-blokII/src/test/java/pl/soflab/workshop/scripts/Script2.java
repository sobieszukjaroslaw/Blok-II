package pl.soflab.workshop.scripts;

import org.junit.Assert;
import org.junit.Test;

import pl.soflab.workshop.base.BaseTest;
import pl.soflab.workshop.pages.LoginPage;
import pl.soflab.workshop.pages.MainPage;
import pl.soflab.workshop.pages.MyAccount;

public class Script2 extends BaseTest {
	
	@Test //test sprawdzający poprawność logowania użytkownika który istnieje
	public void authorizationUser() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.fillLoginEmail("test@sof.pl");
		loginPage.fillPassword("qwe321");
		loginPage.clickLogin();
		
		MyAccount myAccount = new MyAccount(driver);
		String actual = myAccount.getTitle();
		String expected = "My account - My Store";
		Assert.assertEquals("Registration passed",expected, actual);
	}
	@Test  //test sprawdzający próbę logowania z niepoprawnymi danymi
	public void authorizationUserFailed() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.fillLoginEmail("1111@sof.pl");
		loginPage.fillPassword("blasdlasd");
		loginPage.clickLogin();
		
		MyAccount myAccount = new MyAccount(driver);
		String actual = myAccount.getTitle();
		String expected = "My account - My Store";
		Assert.assertTrue("Autoryzacja zakończona niepowodzeniem", expected.equals(actual));

	}
}
