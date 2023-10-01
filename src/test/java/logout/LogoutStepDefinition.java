package logout;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	WebDriver driver;
    LogoutPageObject  logoutPageObject = new LogoutPageObject();

	 

	public LogoutStepDefinition() {

		super();

		driver = Setup.driver;
		

		PageFactory.initElements(driver, LogoutPageObject.class);
	}


	@When("je fais un mouse hoover sur l'icône «Bonjour TEST Comptes et listes»")
	public void jeFaisUnMouseHooverSurLIcôneBonjourTESTComptesEtListes(){
		logoutPageObject.identifieVousBtn();

	}
	@When("je clique sur Déconnexion")
	public void jeCliqueSurDéconnexion() {
	
		logoutPageObject.signoutBtn();
	}
	@Then("je devrais être déconnecté et redirigé vers la page de connexion Amazon {string}")
	public void jeDevraisÊtreDéconnectéEtRedirigéVersLaPageDeConnexionAmazon(String msgAtendu) {
		String msgObtenu = logoutPageObject.verifPageConx();

		Assert.assertEquals(msgAtendu, msgObtenu);

		//System.out.println("Automated test completed.");
	}



}









