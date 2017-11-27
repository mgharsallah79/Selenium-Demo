package com.dr.framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.apache.commons.io.FileUtils;

public class Page {

	private WebDriver driver;
	
	public Page(WebDriver webdriver) {
		
		this.driver = webdriver;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public Page Navigate(String url) {
		
		return this;
	}
	
	public boolean isTextPresent(String text) {
		
		String locator = String.format("//*[text(='%s' or contains(text(), %s)]", text, text);
		Control element = new Control(this,By.xpath(locator));
		
		return element.exists();
	}
	
   
	public File makeScreenShot(String destination) throws IOException {
		
		WebDriver augmentedDriver = new Augmenter().augment(getDriver());
		File srcFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		File output = new File(destination);
		FileUtils.copyFile(srcFile,output);
		
		return output;
		
	}
}
