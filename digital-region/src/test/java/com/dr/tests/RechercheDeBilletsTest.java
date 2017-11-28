package com.dr.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dr.Models.Itineraire;
import com.dr.framework.Configuration;
import com.poiji.bind.Poiji;

public class RechercheDeBilletsTest extends CommonLib {

	public RechercheDeBilletsTest() {

		super();
	}

	@Test

	public void RechercheBilletAllerRetour() throws IOException {
		String testDataFile = Configuration.get("test_data_folder") + "Itineraires.xls";
		List<Itineraire> itineraires = Poiji.fromExcel(new File(
				"C:\\Users\\mahdigharsallah\\git\\sncf-automation\\digital-region\\src\\test\\resources\\TestData\\Itineraires.xlsx"),
				Itineraire.class);
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
