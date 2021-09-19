package org.itech.locatorform.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class represents the Login page
 */
public class KeyClockLoginPage extends Page {
	
	private static final String PATH_LOGIN = "/LoginPage.do";
	
	private static final By FIELD_USERNAME = By.id("loginName");
	
	private static final By FIELD_PASSWORD = By.id("password");
	
	private static final By BUTTON_SUBMIT = By.id("submitButton");
	
	static final String LOGOUT_PATH = "/logout";
	
	private String username;
	
	private String password;
	
	public KeyClockLoginPage(WebDriver driver) {
		super(driver);
		username = properties.getUsername();
		password = properties.getPassword();
	}
	
	@Override
	public void go() {
		goToPage(PATH_LOGIN);
	}
	
	@Override
	public String getPageUrl() {
		return PATH_LOGIN;
	}
	
	public void enterUsername(String username) {
		findElement(FIELD_USERNAME).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		findElement(FIELD_PASSWORD).sendKeys(password);
	}
	
	public WebElement getLoginButton() {
		return findElement(BUTTON_SUBMIT);
	}
	
	public HealthDeskViewPage goToHealthDeskViewPage() {
		go();
		enterUsername(this.username);
		enterPassword(this.password);
		getLoginButton().click();
		return new HealthDeskViewPage(this);
	}
}