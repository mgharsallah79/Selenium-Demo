package com.dr.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SearchTicket {
	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahdigharsallah\\eclipse\\java-oxygen\\eclipse\\chromedriver.exe");
    	driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void verifyPageTitle() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.ter.sncf.com/bretagne");

        String actualTitle = driver.getTitle();
        String expectedTitle = "SNCF TER Bretagne";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
