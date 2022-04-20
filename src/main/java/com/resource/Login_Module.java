package com.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Module {
	public WebDriver driver;

	public Login_Module(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login")
	WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
