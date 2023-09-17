package authentification;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition  {
    // Declare instance variables

	private WebDriver driver;

	private AuthentificationPageObject authPageObj = new AuthentificationPageObject();

	public AuthentificationStepDefinition() {

		super();// Call the superclass constructor

		driver = Setup.driver; // Initialize the WebDriver instance from the Setup class

		PageFactory.initElements(driver, AuthentificationPageObject.class);// Initialize page elements
	}
	// ... Step definitions for Cucumber scenarios ...
	@Given("je me connecte sur l'application")
	public void jeMeConnecteSurLApplication() {
		
		driver.get("https://www.amazon.fr/");
	}

	@Given("j'accepte les cookies")
	public void jAccepteLesCookies(){
		authPageObj.cliqAcceptCookies();
	}

	@When("je clique sur identifiez vous")
	public void jeCliqueSurIdentifiezVous() {
		authPageObj.identifierVous();
	}
	
	@When("je saisi l'email  {string}")
	public void jeSaisiLEmail(String email) {
		authPageObj.inputEmail(email);
	}

	@When("je clique sur le bouton Continuer")
	public void jeCliqueSurLeBoutonContinuer() {
		authPageObj.continueBtn();
	}

	@When("je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String password) {
		authPageObj.inputPassword(password);
	}

	@When("je clique sur le bouton S'identifier")
	public void jeCliqueSurLeBoutonSIdentifier() {
		authPageObj.signInSubmitBtn();
	}

	@Then("je me redirige vers la page d'accueil de client et {string} s'affiche")
	public void jeMeRedirigeVersLaPageDAccueilDeClientEtSAffiche(String string) {
				   
		String msgAtendu = authPageObj.verifMsgObtenu();
		   
		Assert.assertEquals(string, msgAtendu );

		//System.out.println("Automated test completed.");
	}
}
