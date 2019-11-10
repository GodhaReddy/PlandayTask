package tests.Planday.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {
		
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	private WebElement emailField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='emailInvalid']")
	private WebElement emailInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//input[@id='fullname']")
	private WebElement fullNameField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='fullnameInvalid']")
	private WebElement fullNameInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	private WebElement companyField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='companyInvalid']")
	private WebElement companyInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//select[@id='Industry']")
	private WebElement industryField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='industryInvalid']")
	private WebElement industryInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//select[@id='Number of employees']")
	private WebElement numberOfEmployeesField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='employeesInvalid']")
	private WebElement employeesInvalidMsg;
	
	@FindBy(how = How.NAME, using = "phone")
	private WebElement phoneNumberField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='phoneInvalid']")
	private WebElement phoneNumberInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	private WebElement passwordField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='passwordInvalid']")
	private WebElement passwordInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//label[@id='consentLabel']")
	private WebElement consentField;
	
	@FindBy(how = How.XPATH, using = "//*[@id='consentInvalid']")
	private WebElement consentInvalidMsg;
	
	@FindBy(how = How.XPATH, using = "//button[@name='create_account']")
	private WebElement createAccountButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='show-hide-password']")
	private WebElement showPassword;
	
	@FindBy(how = How.XPATH, using = "//a[@id='cookieChoiceDismiss']")
	private WebElement cookieDismiss;
	
	@FindBy(how = How.ID, using = "madeupfield")
	private WebElement MadeupField;
	
	public WebElement isEmailField() {
			return emailField;
	}
	
	public WebElement isEmailInvalid() {
		return emailInvalidMsg;
	}
	
	public WebElement isFullNameField() {
		return fullNameField;
	}
	
	public WebElement isFullNameInvalid() {
		return fullNameInvalidMsg;
	}
	
	public WebElement isCompanyField() {
			return companyField;
	}
	
	public WebElement isCompanyInvalid() {
		return companyInvalidMsg;
	}
	
	public WebElement isIndustryField() {
			return industryField;
		}
	
	public WebElement isIndustryInvalid() {
		return industryInvalidMsg;
	}
	
	public WebElement isNumberOfEmployeesField() {
			return numberOfEmployeesField;
		}
	
	public WebElement isNumberOfEmployeesInvalid() {
		return employeesInvalidMsg;
	}
	
	public WebElement isPhoneNumberField() {
			return phoneNumberField;
		}
	
	public WebElement isPhoneNumberInvalid() {
		return phoneNumberInvalidMsg;
	}
	
	public WebElement isPasswordField() {
		return passwordField;
	}
	
	public WebElement isPasswordInvalid() {
		return passwordInvalidMsg;
	}
	
	public WebElement isConsentField() {
		return consentField;
	}
	
	public WebElement isConsentInvalid() {
		return consentInvalidMsg;
	}
	
	public WebElement isCreateAccount() {
		return createAccountButton;
	}
	
	public WebElement isShowPassword() {
		return showPassword;
	}
	
	public WebElement isCookie() {
		return cookieDismiss;
	}
	
	public WebElement isMadeUpField() {
		return MadeupField;
	}

	public SignUpPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
