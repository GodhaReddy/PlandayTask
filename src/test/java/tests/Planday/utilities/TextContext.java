package tests.Planday.utilities;

import tests.Planday.managers.PageObjectManager;
import tests.Planday.managers.WebDriverManager;

public class TextContext {
	private WebDriverManager webdriverManager;
	private PageObjectManager pageObjectManager;
	
	public TextContext() {
		webdriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webdriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriver() {
		return webdriverManager;
	}
	
	public PageObjectManager getObjectManger() {
		return pageObjectManager;
	}
}
