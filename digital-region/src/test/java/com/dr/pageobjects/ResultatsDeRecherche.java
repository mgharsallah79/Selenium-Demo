package com.dr.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResultatsDeRecherche {
	
	private WebDriver driver;
	
	 public ResultatsDeRecherche(WebDriver driver){

	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	 }
	 
	 public String getPageTitle() throws Exception {
		 
		 return driver.getTitle();
	 }

}
