package com.dr.tests;

import org.testng.annotations.Test;

import com.dr.pageobjects.HorairesEtAchats;
import com.dr.pageobjects.ResultatsDeRecherche;
import com.dr.entities.Trip;
import com.dr.entities.Passenger;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SearchTicket {
	private WebDriver driver;
	HorairesEtAchats horairesetachats;
	ResultatsDeRecherche resultatsderecherche;
	Trip trip;
	Passenger passenger_1;
	Passenger passenger_2;

    @BeforeTest
    public void setup() {
    	
    	setupChromeDriver("https://www.ter.sncf.com/bretagne");
    }

    
    @AfterTest
    public void teardown() {
    	
    	driver.quit();
    }
              
    @Test
    public void userCanSearchForaOneWayTicket() {
    	
    	//Arrange
    	horairesetachats = new HorairesEtAchats(driver);
    	trip = new Trip("Rennes","St-Malo","17/11/2017","18/11/2017");
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
	private void setupChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahdigharsallah\\eclipse\\java-oxygen\\eclipse\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--start-maximized");
    	options.addArguments("--test-type");
    	driver = new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
	}
}
