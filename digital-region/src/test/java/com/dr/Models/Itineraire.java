package com.dr.Models;

import com.poiji.annotation.ExcelCell;

public class Itineraire {

	@ExcelCell(0)
	private String idItineraire;

	@ExcelCell(1)
	private String typeDepart;

	@ExcelCell(2)
	private String lieuDepart;

	@ExcelCell(3)
	private String critereHoraireDepart;

	@ExcelCell(4)
	private String dateDepart;

	@ExcelCell(5)
	private String heureDepart;

	@ExcelCell(8)
	private String lieuArrivee;

	@ExcelCell(10)
	private String dateRetour;
	
	@ExcelCell(11)
	private String heureRetour;

	@Override
	public String toString() {
		return "Passager{" + "Id=" + idItineraire + ", Ville de départ='" + lieuDepart + '\'' + ", date de départ='"
				+ dateDepart + '\'' + ", ville d'arrivée=" + lieuArrivee + '\'' + '}';
	}

	public String getLieuDepart() {
		return lieuDepart;
	}

	public String getDateDepart() {
		return dateDepart.toString();
	}

	public String getHeureDepart() {
		return heureDepart;
	}
	
	public String getHeureRetour() {
		return heureRetour;
	}

	public String getDateRetour() {
		return dateRetour.toString();
	}

	public String getLieuArrivee() {
		return lieuArrivee;
	}

}
