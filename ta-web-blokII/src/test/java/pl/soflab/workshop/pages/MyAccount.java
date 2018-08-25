package pl.soflab.workshop.pages;

import org.openqa.selenium.WebDriver;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		String title = driver.getTitle().toString();
		return title;
	}

}
