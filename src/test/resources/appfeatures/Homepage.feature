Feature: Home page functionality
Scenario: validate title of page
Given user is at amazon home page
Then page title  should contains "Shopping"

Scenario: Validate cart icon
Given user is at amazon home page
Then cart icon should display

Scenario: validate search mobile
Given user is at amazon home page
When user search "mobile" from text field
Then user should see mobiles
When user click on mobile
Then mobile page should get open
