package com.dr.pageobjects;

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

	public RechercheHoraires(WebDriver driver) {
		super(driver);
/*		if (!this.checkPageTitle("SNCF TER Bretagne - Horaires"))
			throw new WrongPageException("Page d'acceuil SNCF TER Bretagne introuvable");*/
	}

	@Override

	public Page Navigate() {

		String baseUrl = Configuration.get("base_url");
		this.getDriver().get(baseUrl);

		return this;

	}

	public void enterGareDeDepart(String gareDeDepart) throws Exception {

		departTextBox.setText(gareDeDepart);
		// this.getDriver().findElement(By.xpath("//span[@title='Rennes']")).click();
		// arriveesDepartsOptions.selectByText(gareDeDepart);

	}

	public void enterGareArrivee(String gareArrivee) {

		arriveeTextBox.setText(gareArrivee);
		// arriveesDepartsOptions.selectByText(gareArrivee);
		// this.getDriver().findElement(By.xpath("//span[@title='St-Malo']")).click();
		// selectOptionFromAutosuggestionList(departureArrivalOptions,gareArrivee);
	}

	public void selectDepartureDate(String departureDate) {

		dateAller.setText(departureDate);
	}

	public void selectHeureDepart(String heuredepart) {

		heureDepart.selectByText(heuredepart);
	}

	public void rechercherHoraires() {

		submitButton.click();
	}

}
