Feature: Buy products scenario 
	
	@Test
	Scenario: Buying products end2end test
	Given open chrome and start application
	When user click in t-shirts menu
	Then user should be moved to page with t-shirts
	When user navigate to t-shirt
	And user click add to cart
	Then user should be see window with confirmation
	When user click on button Proceed to checkout
	Then user should be moved to shopping card summary
	When user click on button Proceed to checkout
	Then user should be moved to next step sign in
	When user fill in the "email" field with "test@sof.pl"
	And user fill in the "password" field with "qwe321"
	And click sign in button
	Then user should be moved to address step
	When user click on button Proceed to checkout
	Then user should be moved to shipping step
	When user click on the checkbox with terms of service
	And user click on the button Proceed to checkout
	Then user is moved to Payment step
	When user click on the payment type
	Then user is moved to order summary
	When user click I confirm my order
	Then user is moved to step with check content
	