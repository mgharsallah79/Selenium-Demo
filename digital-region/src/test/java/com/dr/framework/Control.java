package com.dr.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class Control {

	public static final long TIMEOUT = Configuration.timeout();
	private Page parent;
	By locator;

	public Control(Page parentValue, By locatorValue) {
		super();
		this.parent = parentValue;
		this.locator = locatorValue;
	}
	
	public WebDriver getDriver() {
		
		return parent.getDriver();
	}
	
	public WebElement getElement() {
		
		return getDriver().findElement(locator);
	}
	
	public boolean exists(long timeout) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
		try {
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			return false;
		}
		
		return true;
	}
	
	public boolean exists() {
		return exists(TIMEOUT);
	}
	
	public void click() {
		Assert.assertTrue("Unable to find element: " + this.locator.toString() , exists());   
		this.getElement().click();
	}
	
}
