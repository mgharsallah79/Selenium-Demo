package com.dr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.dr.framework.Control;
import com.dr.framework.Page;

public class ResultatsDeRecherche extends Page {

	public Control pageTitle;

	public ResultatsDeRecherche(WebDriver driver) {

		super(driver);
		pageTitle = new Control(this, By.xpath("//h1[contains(.,'Résultats devotre recherche')]"));
	}

	/*
	 * public String getPageTitle() throws Exception {
	 * 
	 * return driver.getTitle(); }
	 */

}
