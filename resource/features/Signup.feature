#Author: godha.reddy17@gmail.com
@task
Feature: Signup form

Scenario: Verifying if Company Name, Industry, Number of Employees and Phone Number are present on the signup page
Given The URL of the website
When User is on signup page 
Then Verify Company Name, Industry, Number of Employees and Phone Number fields are present in the signup page

Scenario: Verify the presence of a non-existing made up Field
Given The URL of the website
When User is on signup page 
Then The presence of a non-existing field is verified

Scenario: Verification of the Number of Employees drop down field
Given The URL of the website
When User is on signup page 
Then Number of employees drop down verification

Scenario: Populate sign up form with invalid data and submit
Given The URL of the website
When User is on signup page
And populate the fields with invalid data 
Then Submit the signup form
And Unsuccessful submission and error messages will appear

Scenario: Populate sign up form with valid data and submit
Given The URL of the website
When User is on signup page
And populate the fields with valid data and check the consent checkbox
Then Submit the signup form
And Successfully submitted and navigated to the next page