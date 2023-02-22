Feature: Testing Orange HRM
Scenario: To test login page of Orange HRM
Given User should be in the login page
When Enter the valid username "Admin"
And Enter the valid password "admin123"
And Click on the login button
then I should get the title "OrangeHRM"