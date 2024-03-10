Feature: Login to app with data
Scenario: Login with correct credentiala
Given I am at landing page
When I enter the username as "testusername"
And I enter the password as "Test@1234"
And I clicked on submit button 
Then I should get logged into app