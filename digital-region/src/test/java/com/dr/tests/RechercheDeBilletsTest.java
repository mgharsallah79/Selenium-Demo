package com.dr.tests;

import java.io.IOException;
import org.testng.annotations.Test;

import com.dr.Models.Itineraire;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() throws Exception {

		Itineraire itineraire = itineraires.get(0);

		recherchehoraire.enterGareDeDepart(itineraire.getLieuDepart());
		recherchehoraire.enterGareArrivee(itineraire.getLieuArrivee());
		recherchehoraire.selectDepartureDate(itineraire.getDateDepart());
		recherchehoraire.selectHeureDepart(itineraire.getHeureDepart());
		recherchehoraire.selectDateRetour(itineraire.getDateRetour());
		recherchehoraire.selectHeureRetour(itineraire.getHeureRetour());
		recherchehoraire.rechercherHoraires();
		// recherchehoraire.makeScreenShot("./test-output/screenshots/image02.png");

	}
}
