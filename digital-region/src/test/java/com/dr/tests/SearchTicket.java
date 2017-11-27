package com.dr.tests;

import org.testng.annotations.Test;

import com.dr.pageobjects.HorairesEtAchats;
import com.dr.pageobjects.ResultatsDeRecherche;
import com.dr.entities.Trip;
import com.dr.framework.Configuration;
import com.dr.entities.Passenger;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SearchTicket extends CommonLib {
	

	Trip trip;
	Passenger passenger_1;
	Passenger passenger_2;

	
	public SearchTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

              
    @Test
    public void userCanSearchForaOneWayTicket() throws Exception {
    	
    	//Arrange
    	horairesetachats = new HorairesEtAchats(driver);
    	trip = new Trip("Rennes","St-Malo","27/11/2017","28/11/2017");
    	passenger_1 = new Passenger(19,"Bretagne","carte jeune");
    	passenger_2 = new Passenger(35,"Bretagne","");
    	   	
    	//Act
    	horairesetachats.selectDepartGareMode();
    	horairesetachats.enterGareDeDepart(trip.getGareDepart());
    	horairesetachats.enterGareArrivee(trip.getGareArrivee());
    	horairesetachats.selectDepartureDate(trip.getDateDepart());
    	horairesetachats.openPassengerSection();
    	//horairesetachats.addPassenger(passenger_1);
    	//horairesetachats.addPassenger(passenger_2);
    	horairesetachats.rechercherHoraires();   
    	
    	//Assert    	
    	resultatsderecherche = new ResultatsDeRecherche(driver);
    	String actualTitle = resultatsderecherche.getPageTitle().trim().toLowerCase();
    	System.out.println("titre de la page: " + actualTitle);
        String expectedTitle = "TER Bretagne - Horaires de Rennes à St-Malo".trim().toLowerCase();
        Assert.assertEquals(actualTitle,expectedTitle);    	    	  	
    }
    
    
    //should be moved to utils package under a class that manages chromedriver

}
