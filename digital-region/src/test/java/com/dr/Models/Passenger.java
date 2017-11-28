package com.dr.Models;

public class Passenger {

	private int _age;
	private String _region;
	private String _carte;
	
	public Passenger(int age, String region, String carte) {
		
		this._age = age;
		this._region = region;
		this._carte = carte;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}

	public String get_region() {
		return _region;
	}

	public void set_region(String _region) {
		this._region = _region;
	}

	public String get_carte() {
		return _carte;
	}

	public void set_carte(String _carte) {
		this._carte = _carte;
	}
	
	

}
