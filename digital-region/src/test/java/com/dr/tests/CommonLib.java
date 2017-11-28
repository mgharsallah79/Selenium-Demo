package com.dr.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.dr.framework.Configuration;
import com.dr.pageobjects.RechercheHoraires;
import com.dr.pageobjects.ResultatsDeRecherche;

public class CommonLib {
	public WebDriver driver;
	public RechercheHoraires recherchehoraire;
	public ResultatsDeRecherche resultatsderecherche;


	public CommonLib() {
	}

	@BeforeTest
	public void setup() throws IOException {

		Configuration.load();
		Configuration.print();
		String baseUrl = Configuration.get("base_url");
		setupChromeDriver(baseUrl);
	}

	@AfterTest
	public void teardown() {

		//driver.quit();
	}

	private void setupChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", new File("drivers\\chromedriver.exe").getAbsolutePath());
		// System.setProperty("webdriver.chrome.driver", new
		// File("C:\\Users\\mahdigharsallah\\eclipse\\java-oxygen\\eclipse\\chromedriver.exe").getAbsolutePath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--test-type");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		recherchehoraire = new RechercheHoraires(driver);
		driver.get(url);
		//recherchehoraire.Navigate(url);
	}
}