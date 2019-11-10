$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:resource/features/Signup.feature");
formatter.feature({
  "name": "Signup form",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.scenario({
  "name": "Verifying if Company Name, Industry, Number of Employees and Phone Number are present on the signup page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.step({
  "name": "The URL of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_URL_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Company Name, Industry, Number of Employees and Phone Number fields are present in the signup page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.verify_Company_Name_Industry_Number_of_Employees_and_Phone_Number_fields_are_present_in_the_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the presence of a non-existing made up Field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.step({
  "name": "The URL of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_URL_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The presence of a non-existing field is verified",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_presence_of_a_non_existing_field_is_verified()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of the Number of Employees drop down field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.step({
  "name": "The URL of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_URL_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Number of employees drop down verification",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.number_of_employees_drop_down_verification()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Populate sign up form with invalid data and submit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.step({
  "name": "The URL of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_URL_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "populate the fields with invalid data",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinitions.populate_the_fields_with_invalid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submit the signup form",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.submit_the_signup_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Unsuccessful submission and error messages will appear",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinitions.unsuccessful_submission_and_error_messages_will_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Populate sign up form with valid data and submit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task"
    }
  ]
});
formatter.step({
  "name": "The URL of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpStepDefinitions.the_URL_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpStepDefinitions.user_is_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "populate the fields with valid data and check the consent checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinitions.populate_the_fields_with_valid_data_and_check_the_consent_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Submit the signup form",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinitions.submit_the_signup_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successfully submitted and navigated to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpStepDefinitions.successfully_submitted_and_navigated_to_the_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});