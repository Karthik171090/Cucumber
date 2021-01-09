package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	protected static WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);
		maximize();
	}

	public WebElement findelementId(WebDriver driver, String id) {
		return driver.findElement(By.id(id));

	}

	public WebElement findelementName(WebDriver driver, String name) {
		return driver.findElement(By.name(name));
	}

	public WebElement findelementClassName(WebDriver driver, String classname) {
		return driver.findElement(By.className(classname));
	}

	public WebElement findelementXpath(WebDriver driver, String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void close(WebDriver driver) {
		driver.close();
	}

	public void getTitle(WebDriver driver) {
		driver.getTitle();
	}

	public void getCurrent(WebDriver driver) {
		driver.getCurrentUrl();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void navigateTo(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}

	public void navigateForward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void navigateRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public void isSelected(WebElement element) {
		element.isSelected();
	}

	public void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public void moveToElement(Actions action, WebElement element) {
		action.moveToElement(element).perform();
	}

	public void dragAndDrop(Actions action, WebElement element, WebElement element1) {
		action.dragAndDrop(element, element1).perform();
	}

	public void contextClick(Actions action, WebElement element) {
		action.contextClick(element).perform();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	}

	public void doubleClick(Actions action, WebElement element) {
		action.doubleClick(element).perform();
	}

	public void switchToFrame(WebDriver driver, int id) {
		driver.switchTo().frame(id);
	}

	public void switchToFrameName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	public void getText(WebElement element) {
		element.getText();
	}

	public void getAttribute(WebElement element, String text) {
		element.getAttribute(text);
	}

	public void clear(WebElement element) {
		element.clear();
	}

	public void getWindowHandle(WebDriver driver) {
		driver.getWindowHandle();
	}

	public void alertDismiss(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public void alertAccept(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void selectByValue(WebElement element, String name) {
		Select s = new Select(element);
		s.selectByValue(name);

	}

	public void selectByVText(WebElement element, String name) {
		new Select(element).selectByVisibleText(name);

	}
}
