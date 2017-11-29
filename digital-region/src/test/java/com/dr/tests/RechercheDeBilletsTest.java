package com.dr.tests;

import java.io.IOException;
import org.testng.annotations.Test;

import com.dr.Models.Itineraire;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() throws IOException {

		Itineraire itineraire = itineraires.get(0);

		recherchehoraire.departTextBox.setText(itineraire.getLieuDepart());
		recherchehoraire.arriveeTextBox.setText(itineraire.getLieuArrivee());
		recherchehoraire.dateAller.setText(itineraire.getDateDepart());
		recherchehoraire.heureDepart.selectByText(itineraire.getHeureDepart());
		recherchehoraire.dateRetour.setText(itineraire.getDateRetour());
		recherchehoraire.submitButton.click();
		// recherchehoraire.makeScreenShot("./test-output/screenshots/image02.png");

	}
}
