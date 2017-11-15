package com.tr.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class HorairesEtAchats {

	 WebDriver _driver;
	
	 @FindBy(id="dep-radio-gare")
	 WebElement departGareRadioButton;
	 
	 @FindBy(id="dep-radio-adresse")
	 WebElement departAdresseRadioButton;
	 
	 @FindBy(id="rh-depart-gare")
	 WebElement departTextBox;
	 
	 @FindBy(id="ui-id-1")
	 WebElement gareDepartautoOptions;
	 
	 @FindBy(id="rh-arrivee-gare")
	 WebElement arriveeTextBox;
	 
	 @FindBy(id="rh_date")
	 WebElement dateAllerSelector;
	 
	 @FindBy(id="rh_critere")
	 WebElement critereAllerSelector;
	 
	 @FindBy(id="rh_heure")
	 WebElement heureAllerSelector;
	 
	 @FindBy(id="rh_minute")
	 WebElement minuteAllerSelector;
	 
	 @FindBy(id="rh_date_back")
	 WebElement dateRetourSelector;
	 
	 @FindBy(id="rh_critere_back")
	 WebElement critereRetourSelector;
	 
	 @FindBy(id="rh_heure_back")
	 WebElement heureRetourSelector;
	 
	 @FindBy(id="rh_minute_back")
	 WebElement minuteRetourSelector;
	 
	 @FindBy(id="submit_rh_basic")
	 WebElement submitButton;
	 
	 public HorairesEtAchats(WebDriver driver){

	        this._driver = driver;
	        PageFactory.initElements(driver, this);
	 }
	 
	 public void selectDepartGareMode() {		 
		 
		   if (!departGareRadioButton.isSelected()) {
		       departGareRadioButton.click();
		     }
		 }
	 
	 public void enterGareDeDepart(String gareDeDepart) {
		 
		 departTextBox.sendKeys(gareDeDepart);
		 //departTextBox.sendKeys(Keys.ARROW_DOWN);
		 //departTextBox.sendKeys(Keys.ARROW_UP);
		 //departTextBox.click();
		 //departTextBox.sendKeys(Keys.ARROW_DOWN);
		 departTextBox.sendKeys(Keys.ENTER);
	 }
	 
	 public void enterGareArrivee(String gareArrivee) {
		 
		 arriveeTextBox.sendKeys(gareArrivee);
		 //arriveeTextBox.sendKeys(Keys.ARROW_DOWN);
		 //arriveeTextBox.sendKeys(Keys.ARROW_UP);
		 //arriveeTextBox.click();
		 arriveeTextBox.sendKeys(Keys.ENTER);
	 }
	 
	 public void selectDepartureDate(String departureDate) {
		 
		 dateAllerSelector.clear();
		 dateAllerSelector.sendKeys(departureDate);		 
	 }
	 
	 	 
	 public void rechercherHoraires() {
		 
		 submitButton.click();
	 }
	 
	 
}
