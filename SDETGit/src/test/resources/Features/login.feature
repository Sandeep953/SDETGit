Feature: Login Page Automation of saucedemo page
Scenario Outline: Check login is successfull with valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User is navigated to Home Page
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
