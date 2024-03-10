Feature: Order Information
Background:
Given user should be logged into application
When user click on order button
Then user redirect to orders page

Scenario: Fetch Currently placed order
When user click on current order button
Then user should see the current order information

Scenario: Fetch past orders informration 	
When user click on past order button
Then user should see the past order information

Scenario: Fetch cancelled orders informration 	
When user click on cancelled order button
Then user should see the cancelled order information