package com.dr.entities;

public class Trip {

	private String gareDepart;
	private String gareArrivee;
	private String dateDepart;
	private String dateRetour;
	
	public Trip(String garedepart, String garearrivee, String datedepart, String dateretour) {
		
		this.gareDepart = garedepart;
		this.gareArrivee = garearrivee;
		this.dateDepart = datedepart;
		this.dateRetour = dateretour;
	}

	public String getGareDepart() {
		return gareDepart;
	}

	public void setGareDepart(String gareDepart) {
		this.gareDepart = gareDepart;
	}

	public String getGareArrivee() {
		return gareArrivee;
	}

	public void setGareArrivee(String gareArrivee) {
		this.gareArrivee = gareArrivee;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(String dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	

}

