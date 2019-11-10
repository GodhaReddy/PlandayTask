package tests.Planday.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	private WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public WebDriver getDriver() {
		 if(driver == null) driver = createDriver();
		 return driver;
		 }
		 
		 private WebDriver createDriver() {
			 System.setProperty(CHROME_DRIVER_PROPERTY, "resource/drivers/chromedriver.exe");
	         driver = new ChromeDriver();
		    return driver;
		 }
		 
	 
		 public void closeDriver() {
		 driver.close();
		 driver.quit();
		 }

}
