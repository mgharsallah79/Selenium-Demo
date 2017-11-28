/*package com.dr.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dr.framework.Control;
import com.dr.framework.Edit;
import com.dr.framework.Page;

import org.openqa.selenium.WebElement;

public class HorairesEtAchats extends Page {

	public HorairesEtAchats(WebDriver webdriver) {
		super(webdriver);
	}

	// WebDriver _driver;

	@FindBy(id = "dep-radio-gare")
	public Control departGareRadioButton;

	@FindBy(id = "dep-radio-adresse")
	public Control departAdresseRadioButton;

	@FindBy(id = "rh-depart-gare")
	public Edit departTextBox;

	@FindBy(id = "rh-arrivee-gare")
	public Edit arriveeTextBox;

	
	 * @FindBy(
	 * className="ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all"
	 * ) List<WebElement> departureArrivalOptions;
	 

	@FindBy(id = "rh_date")
	public Edit dateAllerSelector;

	@FindBy(id = "rh_critere")
	public Control critereAllerSelector;

	@FindBy(id = "rh_heure")
	WebElement heureAllerSelector;

	@FindBy(id = "rh_minute")
	WebElement minuteAllerSelector;

	@FindBy(id = "rh_date_back")
	WebElement dateRetourSelector;

	@FindBy(id = "rh_critere_back")
	WebElement critereRetourSelector;

	@FindBy(id = "rh_heure_back")
	WebElement heureRetourSelector;

	@FindBy(id = "rh_minute_back")
	WebElement minuteRetourSelector;

	@FindBy(id = "submit_rh_basic")
	public Control submitButton;

	@FindBy(id = "passengers-display")
	WebElement passengerSectionButton;

	
	 * public HorairesEtAchats(WebDriver driver){
	 * 
	 * this._driver = driver; PageFactory.initElements(driver, this);
	 * if(!driver.getTitle().contains("SNCF TER Bretagne - Horaires")) throw new
	 * WrongPageException("Page d'acceuil SNCF TER Bretagne introuvable"); }
	 

	public void selectDepartGareMode() throws Exception {

		departGareRadioButton.click();

	}

	public void enterGareDeDepart(String gareDeDepart) throws Exception {

		departTextBox.setText(gareDeDepart);
		_driver.findElement(By.xpath("//span[@title='Rennes']")).click();
		// selectOptionFromAutosuggestionList(departureArrivalOptions,gareDeDepart);

	}

	public void enterGareArrivee(String gareArrivee) {

		arriveeTextBox.setText(gareArrivee);
		_driver.findElement(By.xpath("//span[@title='St-Malo']")).click();
		// selectOptionFromAutosuggestionList(departureArrivalOptions,gareArrivee);
	}

	public void selectDepartureDate(String departureDate) {

		dateAllerSelector.setText(departureDate);
	}

	public void rechercherHoraires() {

		submitButton.click();
	}

	private void selectOptionFromAutosuggestionList(List<WebElement> optionsList, String optionToSelect) {

		
		 * WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element =
		 * (WebElement) wait.until(
		 * ExpectedConditions.visibilityOfAllElements(departureArrivalOptions);
		 

		System.out.println("options list size is: " + optionsList.size());

		for (WebElement option : optionsList) {
			if (option.getText().equals(optionToSelect)) {
				System.out.println("Trying to select: " + optionToSelect);
				option.click();
				break;
			}
		}

	}

	public void openPassengerSection() {

		passengerSectionButton.click();

	}

}
*/