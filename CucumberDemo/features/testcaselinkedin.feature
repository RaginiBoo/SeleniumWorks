Feature: Linkedin Homepage
This feature verifies the functionality on Linkedin Homepage

Scenario: Check that main elements on Linkedin Homepage are displayed
Given I launch Linkedin browser
When I open Linkedin Homepage

Then Click Signin homepage button
Then Enter the Email id or PhoneNumber
Then Enter the Password

And Click the Sign in  button