package pl.soflab.workshop.scripts;

import org.junit.Assert;
import org.junit.Test;

import pl.soflab.workshop.base.BaseTest;
import pl.soflab.workshop.pages.AccountCreation;
import pl.soflab.workshop.pages.LoginPage;
import pl.soflab.workshop.pages.MainPage;
import pl.soflab.workshop.pages.MyAccount;

public class Script1 extends BaseTest{
	
	@Test
	public void registrationUser() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmailAdress();
		loginPage.clickBtnCreationAccount();
		
		AccountCreation accountCreation = new AccountCreation(driver);
		accountCreation.fillName();
		accountCreation.selectGender();
		accountCreation.fillLastName();
		accountCreation.fillPassword();
		accountCreation.setDayOfBirth("5");
		accountCreation.setMonthOfBirth("January");
		accountCreation.setYearOfBirth("2000");
		accountCreation.clickCheckboxNewsletters();
		accountCreation.clickCheckboxSpecialOffers();
		accountCreation.fillCompany();
		accountCreation.fillCity();
		accountCreation.fillAdress();
		accountCreation.setState("Texas");
		accountCreation.fillZipCode();
		accountCreation.fillMobilePhone();
		accountCreation.fillAlias();
		accountCreation.clickBtbRegister();
		
		MyAccount myAccount = new MyAccount(driver);
		String actual = myAccount.getTitle();
		String expected = "My account - My Store";
		Assert.assertEquals("Registration passed",expected, actual);
	}
}
