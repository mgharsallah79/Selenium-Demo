package com.dr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dr.framework.Configuration;
import com.dr.framework.Control;
import com.dr.framework.Edit;
import com.dr.framework.FindBy;
import com.dr.framework.Page;
import com.dr.framework.SelectList;

public class RechercheHoraires extends Page {

	// public Control departGareRadioButton;

	@FindBy(locator = "rh-depart-gare")
	public Edit departTextBox;

	@FindBy(locator = "rh-arrivee-gare")
	public Edit arriveeTextBox;

	@FindBy(locator = "rh_date")
	public Edit dateAller;

	@FindBy(locator = "rh_date_back")
	public Edit dateRetour;

	@FindBy(locator = "submit_rh_basic")
	public Control submitButton;

	@FindBy(locator = "rh_heure")
	public SelectList heureDepart;
	
	@FindBy(locator = "rh_heure_back")
	public SelectList heureRetour;

	public RechercheHoraires(WebDriver driver) {
		super(driver);
	}

	@Override

	public Page Navigate() {

		String baseUrl = Configuration.get("base_url");
		this.getDriver().get(baseUrl);

		return this;

	}

	public void enterGareDeDepart(String gareDeDepart) throws Exception {

		departTextBox.setText(gareDeDepart);
		selectOptionGare(gareDeDepart);

	}

	public void enterGareArrivee(String gareArrivee) {

		arriveeTextBox.setText(gareArrivee);
		selectOptionGare(gareArrivee);
	}

	public void selectDepartureDate(String departureDate) {

		dateAller.setText(departureDate);
	}
	
	public void selectDateRetour(String dateretour) {

		dateRetour.setText(dateretour);
	}

	public void selectHeureDepart(String heuredepart) {

		heureDepart.selectByText(heuredepart);
	}
	
	public void selectHeureRetour(String heureretour) {

		heureRetour.selectByText(heureretour);
	}

	public void rechercherHoraires() {

		submitButton.click();
	}

	private void selectOptionGare(String Gare) {
		String locator = "//span[@title='" + Gare + "']";
		System.out.println("gare locator " + locator);
		Control control = new Control(this,By.xpath(locator));
		control.click();
	}

}
