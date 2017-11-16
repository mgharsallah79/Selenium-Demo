package com.dr.tests;

import org.testng.annotations.Test;

import com.tr.pageobjects.HorairesEtAchats;
import com.tr.pageobjects.ResultatsDeRecherche;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SearchTicket {
	private WebDriver driver;
	HorairesEtAchats horairesetachats;
	ResultatsDeRecherche resultatsderecherche;

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
    	
    	//Act
    	horairesetachats.selectDepartGareMode();
    	horairesetachats.enterGareDeDepart("Rennes");
    	horairesetachats.enterGareArrivee("St-Malo");
    	horairesetachats.selectDepartureDate("17/11/2017");
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
