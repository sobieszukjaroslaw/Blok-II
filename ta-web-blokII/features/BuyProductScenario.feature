Feature: Buy products scenario 

	Scenario: Buying products without user login
	When user click in t-shirts menu
	Then user should be moved to page with t-shirts
	When user navigate to t-shirt
	And user click add to cart
	Then user should be see window with confirmation
	When user click on button Proceed to checkout
	Then user should be moved to shopping card summary
	When user click on button Proceed to checkout
	Then user should be moved to next step sign in
	
	Scenario: Buying products when user is loged
	When user click in t-shirts menu
	Then user should be moved to page with t-shirts
	When user navigate to t-shirt
	And user click add to cart
	Then user should be see window with confirmation
	When user click on button Proceed to checkout
	Then user should be moved to shopping card summary
	When user click on button Proceed to checkout
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