package tests.Planday.stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import tests.Planday.managers.WebDriverManager;
import tests.Planday.utilities.TextContext;



public class Hooks {
	
	TextContext testContext;
	WebDriverManager webDriverManager;
	WebDriver driver;
	
	public Hooks(TextContext context) {
		testContext = context;
		
	}
	
	@After
	public void AfterStep() {
		testContext.getWebDriver().closeDriver();
		
	}

}
