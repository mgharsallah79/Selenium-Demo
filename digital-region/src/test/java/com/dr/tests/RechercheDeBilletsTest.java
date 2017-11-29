package com.dr.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dr.Models.Itineraire;
import com.dr.framework.PageFactory;
import com.dr.pageobjects.ResultatsDeRecherche;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() throws Exception {

		//Arrange
		Itineraire itineraire = itinerairetestdata.retrieveTestData(0);
		String gareDeDepart = itineraire.getLieuDepart();
		String gareArrivee =  itineraire.getLieuArrivee();
		String dateDeDepart = itineraire.getDateDepart();
		String heureDeDepart = itineraire.getHeureDepart();
		String dateDeRetour = itineraire.getDateRetour();
		String heureDeRetour = itineraire.getHeureRetour();
		
		//Act
		recherchehoraire.enterGareDeDepart(gareDeDepart);
		recherchehoraire.enterGareArrivee(gareArrivee);
		recherchehoraire.selectDepartureDate(dateDeDepart);
		recherchehoraire.selectHeureDepart(heureDeDepart);
		recherchehoraire.selectDateRetour(dateDeRetour);
		recherchehoraire.selectHeureRetour(heureDeRetour);
		recherchehoraire.rechercherHoraires();
		
		//Assert
		resultatsderecherche = PageFactory.init(driver, ResultatsDeRecherche.class);
		String actualPageTitle = resultatsderecherche.GetPageTitle();
		String expectedPageTitle = "TER Bretagne - Horaires de " + gareDeDepart +  " à " +  gareArrivee;
		Assert.assertTrue(expectedPageTitle.equals(actualPageTitle));
		// recherchehoraire.makeScreenShot("./test-output/screenshots/image02.png");
	}
}
