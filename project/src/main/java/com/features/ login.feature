Feature: FaceBook online application

Scenario: verify login page

Given User sholud enter URL
Then  User navigate to login page 

Scenario: verify login test

Given User sholud enter URL
When  User enters valid credentials
Then  User should navigate profile page
