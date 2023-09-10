package forgotPassword;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonMethods;
import Utils.Setup;
import Utils.WaitMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPasswordStepDefinition {
	 
	private WebDriver driver;

	private ForgotPasswordPageObject forgotPasswordPageObj = new ForgotPasswordPageObject();

	private CommonMethods commonMotheds = new CommonMethods();

	private WaitMethods waitMethods = new WaitMethods();
	
	public ForgotPasswordStepDefinition() {
		
		super();
		
		driver = Setup.driver;

		PageFactory.initElements(driver, ForgotPasswordPageObject.class);
		
	}
	
	@Given("^je me trouve sur la page de connexion d'Amazon$")
	public void je_me_trouve_sur_la_page_de_connexion_d_Amazon() throws Throwable {
		
		driver.get("https://www.amazon.fr/");
	}
	
	@Given("^j'accepte les cookies$")
	public void j_accepte_les_cookies() throws Throwable {

		forgotPasswordPageObj.cliqAcceptCookies();
	}

	@When("^je saisis mon adresse e-mail enregistrée \"([^\"]*)\"$")
	public void je_saisis_mon_adresse_e_mail_enregistrée(String arg1) throws Throwable {
	   
		forgotPasswordPageObj.inputEmail(arg1);
	}

	@When("^je clique sur le lien cliquable «Mot de passe oublié»$")
	public void je_clique_sur_le_lien_cliquable_Mot_de_passe_oublié() throws Throwable {
		
		forgotPasswordPageObj.linkForgotPassword();
	}

	@Then("^je dois être redirigé vers la page Vérification requise$")
	public void je_dois_être_redirigé_vers_la_page_Vérification_requise() throws Throwable {
		
		String emailAtendu = "qatest207@gmail.com";
		
		String emailObtenu = forgotPasswordPageObj.emailVerifObtenu();
		
		Assert.assertEquals(emailAtendu, emailObtenu);

		System.out.println("Automated test completed.");
		
	}

	@When("^je saisis mon adresse e-mail enregistrée \"([^\"]*)\" Ou mon numéro de téléphone portable enregistré \"([^\"]*)\"$")
	public void je_saisis_mon_adresse_e_mail_enregistrée_Ou_mon_numéro_de_téléphone_portable_enregistré(String arg1, String arg2) throws Throwable {
		
		forgotPasswordPageObj.emailVerif(arg1);
		// ou par num tel
		//forgotPasswordPageObj.numtel(arg2);
	
	}

	@Then("^je dois voir un message de confirmation indiquant qu'un code de OTP a été envoyé$")
	public void je_dois_voir_un_message_de_confirmation_indiquant_qu_un_code_de_OTP_a_été_envoyé() throws Throwable {
	    
	}

	@When("^je vérifie ma boîte de réception e-mail pour \"([^\"]*)\" Ou mon téléphone pour le code de réinitialisation \"([^\"]*)\"$")
	public void je_vérifie_ma_boîte_de_réception_e_mail_pour_Ou_mon_téléphone_pour_le_code_de_réinitialisation(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^j'ouvre l'e-mail ou le SMS de réinitialisation du mot de passe$")
	public void j_ouvre_l_e_mail_ou_le_SMS_de_réinitialisation_du_mot_de_passe() throws Throwable {
	   
	}

	@Then("^le message doit contenir un code OTP de mot de passe$")
	public void le_message_doit_contenir_un_code_OTP_de_mot_de_passe() throws Throwable {
	   
	}

	@When("^je saisis le code de OTP \"([^\"]*)\"$")
	public void je_saisis_le_code_de_OTP(String arg1) throws Throwable {
	   
	}

	@When("^je saisis un nouveau mot de passe \"([^\"]*)\"$")
	public void je_saisis_un_nouveau_mot_de_passe(String arg1) throws Throwable {
		
		forgotPasswordPageObj.newPassword(arg1);
		
	}

	@When("^je confirme le nouveau mot de passe \"([^\"]*)\"$")
	public void je_confirme_le_nouveau_mot_de_passe(String arg1) throws Throwable {
	 
		forgotPasswordPageObj.newPasswordCheck(arg1);
	}

	@When("^je clique sur le bouton Enregistrer les modifications et se connecter$")
	public void je_clique_sur_le_bouton_Enregistrer_les_modifications_et_se_connecter() throws Throwable {
	   
		forgotPasswordPageObj.btnSaveUpdate();
	}

	@Then("^je dois voir un message de confirmation indiquant que mon mot de passe a été réinitialisé avec succès$")
	public void je_dois_voir_un_message_de_confirmation_indiquant_que_mon_mot_de_passe_a_été_réinitialisé_avec_succès() throws Throwable {
	    
		String succesAtendu = "Votre mot de passe a été modifié.";
		
		String succesObtenu =	forgotPasswordPageObj.succes();
		
		Assert.assertEquals(succesObtenu, succesAtendu);
	}

	@Then("^je clique sur le lien cliquable «skip»$")
	public void je_clique_sur_le_lien_cliquable_skip() throws Throwable {
		
		forgotPasswordPageObj.skip();
	}
	
	@Then("^je dois être connecté et redirigé vers la page d'accueil Amazon$")
	public void je_dois_être_connecté_et_redirigé_vers_la_page_d_accueil_Amazon() throws Throwable {
	    
	}
	// cookies
	
}
