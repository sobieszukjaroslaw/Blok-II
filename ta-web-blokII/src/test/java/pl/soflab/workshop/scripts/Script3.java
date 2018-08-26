package pl.soflab.workshop.scripts;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pl.soflab.workshop.base.BaseTest;
import pl.soflab.workshop.pages.AdressPage;
import pl.soflab.workshop.pages.MainPage;
import pl.soflab.workshop.pages.OrderConfirmationPage;
import pl.soflab.workshop.pages.OrderSummaryPage;
import pl.soflab.workshop.pages.PaymentPage;
import pl.soflab.workshop.pages.ShippingPage;
import pl.soflab.workshop.pages.ShoppingCartSummary;
import pl.soflab.workshop.pages.SignInPage;
import pl.soflab.workshop.pages.TShirtPage;

public class Script3 extends BaseTest {
	private MainPage mainPage;
	private TShirtPage tShirtPage;
	private ShoppingCartSummary shopingCartSummary;
	private SignInPage signInPage;
	private AdressPage addressPage;
	private ShippingPage shippingPage;
	private PaymentPage paymentPage;
	private OrderSummaryPage orderSummaryPage;
	private OrderConfirmationPage orderConfirmationPage;
	
	@Given("open chrome and start application")
	public void open_chrome_and_start_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //utworzenie obiektu przeglądarki chrome
		driver.manage().window().maximize();
	}
	@When("user click in t-shirts menu")
	public void user_click_in_t_shirts_menu() {
		mainPage = new MainPage(driver);
		mainPage.clickTShirt();
	}

	@Then("user should be moved to page with t-shirts")
	public void user_should_be_moved_to_page_with_t_shirts() {
		tShirtPage = new TShirtPage(driver);
	}
	@When("user navigate to t-shirt")
	public void user_navigate_to_t_shirt() {
		tShirtPage.navigateToTShirt();
	}

	@When("user click add to cart")
	public void user_click_add_to_cart() {
		tShirtPage.clickAddToCart();
		
	}

	@Then("user should be see window with confirmation")
	public void user_should_be_see_window_with_confirmation() {
		tShirtPage.waitForElement();
	}

	@When("user click on button Proceed to checkout")
	public void user_click_on_button_Proceed_to_checkout() {
		tShirtPage.clickProceedToCheckout();
		
	}

	@Then("user should be moved to shopping card summary")
	public void user_should_be_moved_to_shopping_card_summary() {
		shopingCartSummary = new ShoppingCartSummary(driver);
		shopingCartSummary.signInPage();

		
	}

	@Then("user should be moved to next step sign in")
	public void user_should_be_moved_to_next_step_sign_in() {
		signInPage = new SignInPage(driver);
	}

	@When("user fill in the {string} field with {string}")
	public void user_fill_in_the_field_with(String login , String password) {
		login = "test@sof.pl";
		password = "qwe321";
		signInPage.fillEmail(login);
		signInPage.fillPassword(password);
		
	}

	@When("click sign in button")
	public void click_sign_in_button() {
		signInPage.clickSignInButton();
	}

	@Then("user should be moved to address step")
	public void user_should_be_moved_to_address_step() {
		addressPage = new AdressPage(driver);
		addressPage.clickProceedToCheckOut();
	}

	@Then("user should be moved to shipping step")
	public void user_should_be_moved_to_shipping_step() {
		shippingPage = new ShippingPage(driver);
	}

	@When("user click on the checkbox with terms of service")
	public void user_click_on_the_checkbox_with_terms_of_service() {
		shippingPage.clickCheckbox();
	}

	@When("user click on the button Proceed to checkout")
	public void user_click_on_the_button_Proceed_to_checkout() {
		shippingPage.clickProceedToCheckout();
	}

	@Then("user is moved to Payment step")
	public void user_is_moved_to_Payment_step() {
		paymentPage = new PaymentPage(driver);
	}

	@When("user click on the payment type")
	public void user_click_on_the_payment_type() {
		paymentPage.clickPayByCheck();
	}

	@Then("user is moved to order summary")
	public void user_is_moved_to_order_summary() {
		orderSummaryPage = new OrderSummaryPage(driver);
	}

	@When("user click I confirm my order")
	public void user_click_I_confirm_my_order() {
		orderSummaryPage.clickConfirmMyOrder();
	}

	@Then("user is moved to step with check content")
	public void user_is_moved_to_step_with_check_content() {
		orderConfirmationPage = new OrderConfirmationPage(driver);		
		String expected = "Order confirmation - My Store";
		Assert.assertEquals("Proces przebiegł prawidłowo",expected.equals( orderConfirmationPage.checkTitle())); //sprawdzenie poprawności tytułu strony 
																												//kończącej proces kupna przedmiotu
	}

}
