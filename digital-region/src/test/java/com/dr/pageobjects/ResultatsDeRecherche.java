package com.dr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dr.framework.Control;
import com.dr.framework.FindBy;
import com.dr.framework.Page;

public class ResultatsDeRecherche extends Page {

	@FindBy(locator = "xpath=(//h1[contains(.,'Résultats devotre recherche')]")
	public Control pageTitle;

	public ResultatsDeRecherche(WebDriver driver) {

		super(driver);
		
	}

	/*
	 * public String getPageTitle() throws Exception {
	 * 
	 * return driver.getTitle(); }
	 */

}
