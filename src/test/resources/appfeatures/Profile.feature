@profile 
Feature: Profile functionality
@sanity
Scenario: verification of add profile
Given User is at the home page
When User click on add button
And user enter the details
Then Profile should get added

@regression
Scenario: verification of edit profile
Given User is at the home page
When User click on edit button
And user update the details
Then Profile should get updated

@functional @sanity
Scenario: verification of delete profile
Given User is at the home page
When User click on delete button
Then Profile should get deleted
