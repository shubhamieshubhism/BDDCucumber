Feature: Login page Automation of saucedemo Application
Scenario Outline: Check login is successful with valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>" 
And Clicks on login button 
Then User is navigated to home page
And Close the browser

Examples: 
| username | password |
| standard_user | secret_sauce |

