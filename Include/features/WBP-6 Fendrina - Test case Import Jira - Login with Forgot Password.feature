@Login

Feature: Login and Password Reset Feature

As a user, I want to perform various login and password reset actions on the application.

Scenario Outline: Verify user can navigate to the login page

Given I open the application
When I click on the 'Login' button
Then I should be on the login page

Scenario Outline: Verify user can reset password

Given I open the application
When I click on the 'Login' button
And I click on the 'Forgot Password' link
And I enter the registered email address <email>
And I click on the 'Reset Password' button
Then I should check if a password reset email is received

Scenario Outline: Verify user can login with new password

Given I open the application
When I click on the 'Login' button
And I enter the registered email address <email>
And I enter the new password <new_password>
And I click on the 'Login' button
Then I should be able to login successfully

Scenario Outline: Verify error message is displayed for invalid email address

Given I open the application
When I click on the 'Login' button
And I enter an invalid email address <email>
And I click on the 'Reset Password' button
Then I should see an error message

Scenario Outline: Verify error message is displayed for non-registered email address

Given I open the application
When I click on the 'Login' button
And I enter a non-registered email address <not_email>
And I click on the 'Reset Password' button
Then I should see an error message

 

Examples:
| email | not_email |password |
| drinatestacc@gmail.com  | drinabukan@gmail.com | notadmin |