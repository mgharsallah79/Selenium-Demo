package com.dr.utils;

import java.io.File;
import java.util.List;

import com.dr.Models.Itineraire;
import com.dr.framework.Configuration;
import com.poiji.bind.Poiji;

public class ItineraireTestData {

	public List<Itineraire> itineraires;
	Itineraire itineraire;

	public ItineraireTestData() {

	}

	public Itineraire retrieveTestData(int index) throws Exception {

		Configuration.load();
		Configuration.print();
		String testDataItineraires = Configuration.get("itineraire_test_data_path");
		itineraires = Poiji.fromExcel(new File(testDataItineraires), Itineraire.class);
		itineraire = itineraires.get(index);

		return itineraire;
	}

}
