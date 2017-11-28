package com.dr.tests;

import org.testng.annotations.Test;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() {

		recherchehoraire.departTextBox.setText("Rennes");
		recherchehoraire.arriveeTextBox.setText("St-Malo");
		recherchehoraire.dateAller.setText("28/11/2017");
		recherchehoraire.dateRetour.setText("29/11/2017");
		recherchehoraire.submitButton.click();

	}
}
