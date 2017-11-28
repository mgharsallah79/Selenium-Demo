package com.dr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dr.framework.Configuration;
import com.dr.framework.Control;
import com.dr.framework.Edit;
import com.dr.framework.Page;
import com.dr.framework.SelectList;

public class RechercheHoraires extends Page {

	public Control departGareRadioButton;
	public Edit departTextBox;
	public Edit arriveeTextBox;
	public Edit dateAller;
	public Edit dateRetour;
	public Control submitButton;
	public SelectList arriveesDepartsOptions;
	

	public RechercheHoraires(WebDriver driver) {
		super(driver);
		departGareRadioButton = new Control(this, By.id("dep-radio-gare"));
		departTextBox = new Edit(this, By.id("rh-depart-gare"));
		arriveeTextBox = new Edit(this, By.id("rh-arrivee-gare"));
		dateAller = new Edit(this, By.id("rh_date"));
		dateRetour = new Edit(this, By.id("rh_date_back"));
		submitButton = new Control(this, By.id("submit_rh_basic"));
		arriveesDepartsOptions = new SelectList(this, By.className("ui-corner-all"));
		
	}

	// @Override

	public Page Navigate() {

		String baseUrl = Configuration.get("base_url");
		this.getDriver().get(baseUrl);

		return this;

	}

	public void enterGareDeDepart(String gareDeDepart) throws Exception {

		departTextBox.setText(gareDeDepart);
		//this.getDriver().findElement(By.xpath("//span[@title='Rennes']")).click();
		//arriveesDepartsOptions.selectByText(gareDeDepart);

	}

	public void enterGareArrivee(String gareArrivee) {

		arriveeTextBox.setText(gareArrivee);
		//arriveesDepartsOptions.selectByText(gareArrivee);
		//this.getDriver().findElement(By.xpath("//span[@title='St-Malo']")).click();
		// selectOptionFromAutosuggestionList(departureArrivalOptions,gareArrivee);
	}

	public void selectDepartureDate(String departureDate) {

		dateAller.setText(departureDate);
	}

	public void rechercherHoraires() {

		submitButton.click();
	}

}
