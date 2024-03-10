Feature: Login functionality
Scenario: login to application
Given I am at login page
When I enter userName
And I enter password
And I clicked on Login Button
Then I should logged into Application

Scenario: validate title
Given I am at login Page
When I should see the title