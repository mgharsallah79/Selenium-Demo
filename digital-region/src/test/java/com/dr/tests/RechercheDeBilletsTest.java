package com.dr.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() throws IOException {

		//Assert.assertTrue(recherchehoraire.isTextPresent("Départ"));
		recherchehoraire.departTextBox.setText("Rennes");
		recherchehoraire.arriveeTextBox.setText("St-Malo");
		recherchehoraire.dateAller.setText("28/11/2017");
		recherchehoraire.heureDepart.selectByText("14h");
		recherchehoraire.dateRetour.setText("29/11/2017");
		recherchehoraire.submitButton.click();
		//recherchehoraire.makeScreenShot("./test-output/screenshots/image01.png");

	}
}
