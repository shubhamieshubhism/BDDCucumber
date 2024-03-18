Feature: This is background demo

Background: User is logged in sauce demo app
Given User is accessing sauce demo login page
When User enters valid username and password 
Then User should be able to navigate to home page

Scenario: Test menu items
And Click on breadcrum icon 
Then User should be able to see the menu items

Scenario: Verify add to cart functionality
And Click on add to button
Then Iten should be add to cart