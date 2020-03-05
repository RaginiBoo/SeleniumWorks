Feature: Google Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on Google Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify that the page displays search text box
Then i verify that text is entered and searched
And clicks the submit button