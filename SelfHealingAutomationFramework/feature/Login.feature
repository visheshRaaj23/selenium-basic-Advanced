#Each Feature file contains only one feature
Feature:  Test the login functionality on SDET university

#It uses Gerkin language
#Scenario uses when-then structure
Scenario:  The User should be able to login with valid username and password

Given User is on the login page
When  User enters correct username and password
Then  The user gets the Confirmation message

Scenario Outline: The user must be able to login with valid username and password

Given User is on the Login Page
When User enters the username<username>
And User enters the password<password>
And Clicks on submit buttn
Then The user gets the confirmation

Examples:
|username|password
|admin|manager
|trainee|trainee