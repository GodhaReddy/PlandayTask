package tests.Planday.managers;

import org.openqa.selenium.WebDriver;

import tests.Planday.pageObjects.SignUpPageObjects;

public class PageObjectManager {

	private SignUpPageObjects signupPageObjects;
	private WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public SignUpPageObjects getSignupPageObjects()
	{
		return (signupPageObjects == null) ? signupPageObjects = new SignUpPageObjects(driver) : signupPageObjects;
	}
}
