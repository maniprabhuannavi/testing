package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.resource.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\test\\java\\com\\adactin\\feature\\adactin.feature", glue = "com.adactin.stepdefinition")
public class Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public void set_Up() {
		driver = BaseClass.browserLaunch("chrome", "https://adactinhotelapp.com/");

	}
	@AfterClass
	public void tear_Down() {
		driver.close();
	}

}
