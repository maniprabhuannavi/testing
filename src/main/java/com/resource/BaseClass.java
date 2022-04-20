package com.resource;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	// browser launch
	public static WebDriver browserLaunch(String browser,String url ) {
	if (browser.equalsIgnoreCase("chrome")) {
		     System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
	}else {
		System.out.println("invalid");
	}
	return driver;
	}
	// open URL
	public static void openUrl(String url) {
		driver.get(url);

	}

	// click
	public static void clickOnElement(WebElement element) {

		element.click();
	}

	// sendkeys
	public static void inputValue(WebElement element, String ss) {
		element.sendKeys(ss);
	}

	// close
	public static void closeElement() {
		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();
	}

	// navogateto
	public static void navigateTo(String str) {
		driver.navigate().to(str);

	}

	// navigate back
	public static void navigateback() {

		driver.navigate().back();
	}

	// navigate forward
	public static void navigateforward() {
		driver.navigate().forward();
	}

	// navigate refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// Get
	public static void get(String str) {
		driver.get(str);
	}

	// Alert
	public static void alertAccept() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertDismiss() {

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	// Action
	public static void actionClick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.click(element);
	}

	public static void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element);
	}

	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element);
	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
	}

	public static void dragAndDrop(WebElement frome, WebElement to) {

		Actions a = new Actions(driver);
		a.clickAndHold(frome).moveToElement(to).build().perform();
	}

	public static void framee(WebElement element) {

		driver.switchTo().frame(element);
	}

	public static void robot() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void windowstitle() {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}

	public static void dropdowns1(WebElement element, int str) {
		Select s = new Select(element);
		s.selectByIndex(str);
	}

	public static void dropdowns2(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByValue(str);
	}

	public static void dropdowns3(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByVisibleText(str);
	}

	public static void getoptions(WebElement element) {
		Select ss = new Select(element);
		List<WebElement> options = ss.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

	public static void checkbox(WebElement element) {
		element.click();

	}

	public static void isEnable(WebElement element) {

		element.isEnabled();
	}

	public static void isDisplayed(WebElement element) {

		element.isEnabled();
	}

	public static void isSelected(WebElement element) {

		element.isEnabled();
	}

	public static void getTitle() {

		driver.getTitle();
	}

	public static void getCurrentUrl() {
		driver.getCurrentUrl();

	}

	public static void getText(WebElement element) {
		element.getText();
	}

	public static void getAttribute(WebElement element, String str) {

		element.getAttribute(str);
	}

	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void explicitlyWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void takesScreenshot(String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File file = t.getScreenshotAs(OutputType.FILE);
		File location = new File(path);
		FileUtils.copyFile(file, location);

	}

	public static void ScrollDown() {
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,400)","");
	}

	public static void ScrollUp() {
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,-400)","");
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}

	public static void getFirstSelected(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}

	public static void getAllSelected(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}

}
