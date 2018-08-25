package pl.soflab.workshop.base;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeClass
	public static void SetUpClass() {
		WebDriverManager.chromedriver().setup(); //Konfiguracja sterownika
	}
	@Before
	public void setUpTest() {
		driver = new ChromeDriver(); //utworzenie obiektu przeglądarki chrome
		driver.manage().window().maximize();  // maksymalizacja okna przeglądarki przed każdym testem
	}
	/*@After
	public void TearDown() {
		if (driver!= null)     // jeżeli przeglądarka jest uruchumiona zamykamy ją po zakończeniu każdego testu
			driver.quit();
	}*/

}
