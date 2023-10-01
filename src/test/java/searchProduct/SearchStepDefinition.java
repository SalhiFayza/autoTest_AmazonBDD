package searchProduct;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition{

	WebDriver driver;
	
	SearchPageObject searchPageObject = new SearchPageObject(); 
	
	public SearchStepDefinition() {

		super();// Call the superclass constructor

		driver = Setup.driver; // Initialize the WebDriver instance from the Setup class

		PageFactory.initElements(driver, SearchPageObject.class);// Initialize page elements
	}
	
	@When("Cliquer sur la liste déroulante « Toutes nos catégories »")
	public void cliquerSurLaListeDéroulanteToutesNosCatégories() {
		
		searchPageObject.category_Select();   
	}
	


	@When("je sélectionne la catégorie «Jeux et Jouets» depuis le menu déroulant")
	public void jeSélectionneLaCatégorieJeuxEtJouetsDepuisLeMenuDéroulant() {
	 
		searchPageObject.itemCategory();
	}

	
	@When("j'entre {string} dans la barre de recherche")
	public void jEntreDansLaBarreDeRecherche(String nameProduct) {
	  
		searchPageObject.inputNameProduct(nameProduct);
	}
	
	@When("je clique sur le bouton de recherche")
	public void jeCliqueSurLeBoutonDeRecherche() {
		//searchPageObject.enterKeyBoard();
		searchPageObject.btnSearch();
	}
	
	@Then("Les résultats de recherche devraient s'afficher {string}")
	public void lesRésultatsDeRechercheDevraientSAfficher(String msgAtendu) {
	    
	String nameObtenu =	searchPageObject.verifNameProduct();
	
	//System.out.println(nameObtenu);
	//System.out.println(string);
	
	Assert.assertEquals( msgAtendu , nameObtenu );
	
	//System.out.println("Automated test completed.");
	
	
	}





}