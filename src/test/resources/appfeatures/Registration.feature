Feature: Opening the Bank Account
Scenario: Opening bank account with nominee
Given User Should be at accounts Page
When User enters the following data
| Eric | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 8899008833 |
 And user clicks on submit button
 Then user should see the confirmation 


