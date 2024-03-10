Feature: Signup Funcationality
Scenario Outline: Signup to Apllication
Given User is at SignUp
When user enters name as "<name>" in form
And user enter age as <age>
And user confirms "<gender>" radio button
Then user gets created

Examples:
| name | age | gender |
| Eder | 23 | male |
| Ron | 40 | male |
| Danial | 45 | male |
| Diana | 32 | female |
