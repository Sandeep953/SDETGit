Feature: This is background demo

Background: User is loggen in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate to home page

Scenario: Test Menu items 

And CLick on breadcrumb icon
Then User should be able to see the menu items

Scenario: Verify add to cart functionality


And CLick on Add to cart button
Then should be added to the cart