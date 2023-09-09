package authentification;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.ChromeDriverManager;
import Utils.CommonMethods;
import Utils.Setup;
import Utils.WaitMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import forgotPassword.ForgotPasswordPageObject;

public class AuthentificationStepDefinition {

	private WebDriver driver;

	private AuthentificationPageObject authPageObj = new AuthentificationPageObject();

	private CommonMethods commenMotheds = new CommonMethods();

	private WaitMethods waitMethods = new WaitMethods();

	public AuthentificationStepDefinition() {

		super();

		driver = Setup.driver;

		PageFactory.initElements(driver, AuthentificationPageObject.class);

	}

	@Given("^je me connecte sur l'application Amazon$")
	public void je_me_connecte_sur_l_application_Amazon() throws Throwable {

		driver.get("https://www.amazon.fr/");

	}

	@Given("^j'accepte les cookies$")
	public void j_accepte_les_cookies() throws Throwable {

		authPageObj.cliqAcceptCookies();
	}

	@When("^je clique sur identifiez vous$")
	public void je_clique_sur_identifiez_vous() throws Throwable {

		authPageObj.identifierVous();
	}

	@When("^je saisi l'email  \"([^\"]*)\"$")
	public void je_saisi_l_email(String arg1) throws Throwable {

		authPageObj.inputEmail(arg1);
	}

	@When("^je clique sur le bouton Continuer$")
	public void je_clique_sur_le_bouton_Continuer() throws Throwable {

		authPageObj.continueBtn();
	}

	@When("^je saisis le mot de passe \"([^\"]*)\"$")
	public void je_saisis_le_mot_de_passe(String arg1) throws Throwable {

		authPageObj.inputPassword(arg1);
	}

	@When("^je clique sur le bouton S'identifier$")
	public void je_clique_sur_le_bouton_S_identifier() throws Throwable {

		authPageObj.signInSubmitBtn();
	}

	@Then("^je me redirige vers la page d'accueil de client et \"([^\"]*)\" s'affiche$")
	public void je_me_redirige_vers_la_page_d_accueil_de_client_et_s_affiche(String arg1) throws Throwable {

		String msgAtendu = "Bonjour TEST";

		String msgObtenu = authPageObj.verifMsgObtenu();

		Assert.assertEquals(msgObtenu, msgAtendu);

		System.out.println("Automated test completed.");

	}
}