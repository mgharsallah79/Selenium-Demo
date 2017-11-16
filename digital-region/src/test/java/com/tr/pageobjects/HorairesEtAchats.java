package com.tr.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class HorairesEtAchats {

	 WebDriver _driver;
	
	 @FindBy(id="dep-radio-gare")
	 WebElement departGareRadioButton;
	 
	 @FindBy(id="dep-radio-adresse")
	 WebElement departAdresseRadioButton;
	 
	 @FindBy(id="rh-depart-gare")
	 WebElement departTextBox;
	 
	 @FindBy(id="rh-arrivee-gare")
	 WebElement arriveeTextBox;
	 
	 @FindBy(className="ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all")
	 List<WebElement> departureArrivalOptions;
	 
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
		 _driver.findElement(By.xpath("//span[@title='Rennes']")).click();
		 //selectOptionFromAutosuggestionList(departureArrivalOptions,gareDeDepart);
    	
	 }
	 
	 public void enterGareArrivee(String gareArrivee) {
		 
		 arriveeTextBox.sendKeys(gareArrivee);
		 _driver.findElement(By.xpath("//span[@title='St-Malo']")).click();
		 //selectOptionFromAutosuggestionList(departureArrivalOptions,gareArrivee);
	 }
	 
	 public void selectDepartureDate(String departureDate) {
		 
		 dateAllerSelector.clear();
		 dateAllerSelector.sendKeys(departureDate);		 
	 }
	 
	 	 
	 public void rechercherHoraires() {
		 
		 submitButton.click();
	 }
	 
	 private void selectOptionFromAutosuggestionList(List<WebElement> optionsList, String optionToSelect) {
		 
			/* WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = (WebElement) wait.until(
		         ExpectedConditions.visibilityOfAllElements(departureArrivalOptions);*/
		 
		 System.out.println("options list size is: " + optionsList.size());
		 
		 for(WebElement option : optionsList){
		        if(option.getText().equals(optionToSelect)) {
		        	System.out.println("Trying to select: "+optionToSelect);
		            option.click();
		            break;
	   	    }
		}  
		 
	 }
	 
	 
}
