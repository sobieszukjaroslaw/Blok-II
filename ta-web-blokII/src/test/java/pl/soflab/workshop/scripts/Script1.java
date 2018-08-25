package pl.soflab.workshop.scripts;

import org.junit.Test;

import pl.soflab.workshop.base.BaseTest;
import pl.soflab.workshop.pages.AccountCreation;
import pl.soflab.workshop.pages.LoginPage;
import pl.soflab.workshop.pages.MainPage;

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
	}
}
