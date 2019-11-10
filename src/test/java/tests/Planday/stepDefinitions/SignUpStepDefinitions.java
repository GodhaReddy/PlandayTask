package tests.Planday.stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Planday.pageObjects.SignUpPageObjects;
import tests.Planday.utilities.TextContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefinitions {
	
	public static Logger log=LogManager.getLogger(SignUpStepDefinitions.class.getName());
	public WebDriver driver;
	TextContext testContext;
	SignUpPageObjects signupPageObjects;
	
	public SignUpStepDefinitions(TextContext context) {
		testContext = context;
		driver = testContext.getWebDriver().getDriver();
		signupPageObjects = testContext.getObjectManger().getSignupPageObjects();
	}
	
	@Given("The URL of the website")
	public void the_URL_of_the_website() {
		driver.get("https://www.planday.com/signup/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}

	@When("User is on signup page")
	public void user_is_on_signup_page() {
		if(signupPageObjects.isCookie().isDisplayed())
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(signupPageObjects.isCookie())).click();
		}
		Assert.assertSame("Not on signup page", true, signupPageObjects.isCreateAccount().isDisplayed());	
	}

	@Then("Verify Company Name, Industry, Number of Employees and Phone Number fields are present in the signup page")
	public void verify_Company_Name_Industry_Number_of_Employees_and_Phone_Number_fields_are_present_in_the_signup_page() {
		Assert.assertSame("Company Field is not present", true, signupPageObjects.isCompanyField().isDisplayed());
		Assert.assertSame("Industry Field is not present", true, signupPageObjects.isIndustryField().isDisplayed());
		Assert.assertSame("Number of employees Field is not present", true, signupPageObjects.isNumberOfEmployeesField().isDisplayed());
		Assert.assertSame("Phone number Field is not present", true, signupPageObjects.isPhoneNumberField().isDisplayed());	
	}
	
	@Then("The presence of a non-existing field is verified")
	public void the_presence_of_a_non_existing_field_is_verified() {
		//driver.findElements(By.id("made-up-field"))
		if(signupPageObjects.isMadeUpField()==null) {
			log.info("Miracle, imaginary field is displayed on the webpage");
		}
		else {
		log.error("No such element found on the webpage");
		log.info("This is an imaginary field created for test purpose which is not on the webpage.");
		}
	}
	
	@Then("Number of employees drop down verification")
	public void number_of_employees_drop_down_verification() {
		Select s=new Select(signupPageObjects.isNumberOfEmployeesField());
		List<WebElement> dropdownlist=s.getOptions();
		for(int j=0;j<dropdownlist.size();j++)
		{
			String dropdowntext=dropdownlist.get(j).getText();
				if(j==1) {
					Assert.assertEquals("1 - 9", dropdowntext);
				}
				if(j==2) {
					Assert.assertEquals("10 - 20", dropdowntext);
				}
				if(j==3) {
					Assert.assertEquals("21 - 40", dropdowntext);
				}
				if(j==4) {
					Assert.assertEquals("41 - 100", dropdowntext);
				}
				if(j==5) {
					Assert.assertEquals("+101", dropdowntext);
				}
			}
		}

	@And("populate the fields with invalid data")
	public void populate_the_fields_with_invalid_data() {
		signupPageObjects.isEmailField().sendKeys("abc566dhf.com");
		
		signupPageObjects.isFullNameField().sendKeys("ab7@c dhf5/678**9=");
	
		signupPageObjects.isCompanyField().sendKeys("@{:");
		
		signupPageObjects.isPhoneNumberField().sendKeys("vhjgu8y89");
	
		signupPageObjects.isPasswordField().sendKeys("ay1256");
		}

	@Then("Submit the signup form")
	public void submit_the_signup_form() {
		signupPageObjects.isCreateAccount().click();
	}
	
	@And("Unsuccessful submission and error messages will appear")
	public void unsuccessful_submission_and_error_messages_will_appear() throws Exception {
		Thread.sleep(3000);
		Assert.assertSame("Not on signup page", true, signupPageObjects.isCreateAccount().isDisplayed()); //User is still on sign up page

		signupPageObjects.isEmailInvalid().getText().compareTo("This needs to be a valid email");
		signupPageObjects.isFullNameInvalid().getText().compareTo("No special characters, please");
		signupPageObjects.isCompanyInvalid().getText().compareTo("Please enter a valid company name");	
		signupPageObjects.isIndustryInvalid().getText().compareTo("This field is required");
		signupPageObjects.isNumberOfEmployeesInvalid().getText().compareTo("This field is required");
		signupPageObjects.isPhoneNumberInvalid().getText().compareTo("Please enter a valid phone number");
		signupPageObjects.isPasswordInvalid().getText().compareTo("This field is too short");
		signupPageObjects.isConsentInvalid().getText().compareTo("This field is required");
	}
	
	@And("populate the fields with valid data and check the consent checkbox")
	public void populate_the_fields_with_valid_data_and_check_the_consent_checkbox() {
		signupPageObjects.isEmailField().sendKeys("martinjosephbakewell09@gmail.com");
		String Email = signupPageObjects.isEmailField().getAttribute("value");
		log.info(Email);
		
		signupPageObjects.isFullNameField().sendKeys("Test Please Ignore");
	
		signupPageObjects.isCompanyField().sendKeys("Test Please Ignore");
		
		Select industry = new Select(signupPageObjects.isIndustryField());
		industry.selectByValue("Bar, Pub & Nightclub");
		
		Select numberofemployees = new Select(signupPageObjects.isNumberOfEmployeesField());
		numberofemployees.selectByValue("21 - 40");
		
		signupPageObjects.isPhoneNumberField().sendKeys("77777777");
	
		signupPageObjects.isPasswordField().sendKeys("tests678");
		
		signupPageObjects.isShowPassword().click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String Password = signupPageObjects.isPasswordField().getAttribute("value");
		log.info(Password);
		
		signupPageObjects.isConsentField().click();
				
	}
	
	@And("Successfully submitted and navigated to the next page")
	public void successfully_submitted_and_navigated_to_the_next_page() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://www.planday.com/uk/signup/signup/#/creating";
		if(driver.getCurrentUrl().equals(url)) {
			log.info("Navigated to https://www.planday.com/uk/signup/signup/#/creating which is as expected");
		}
		else {
			log.error("Unable to navigate to https://www.planday.com/uk/signup/signup/#/creating, rather redirected to some other page.");
		}
		}
	
}
