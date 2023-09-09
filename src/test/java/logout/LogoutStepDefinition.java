package logout;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonMethods;
import Utils.Setup;
import Utils.WaitMethods;
import logout.LogoutPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDefinition {
    private WebDriver driver;
	
	private LogoutPageObject logoutPageObj = new LogoutPageObject();
	 
	private CommonMethods commenMotheds = new CommonMethods();
	
	private WaitMethods waitMethods = new WaitMethods();
	
	public  LogoutStepDefinition() {
		
		super();
		
		driver = Setup.driver;
		
		PageFactory.initElements(driver, LogoutPageObject.class);
	
	}
	
	@Given("^je me déconnecter de mon espace Amazon avec succés$")
	public void je_me_déconnecter_de_mon_espace_Amazon_avec_succés() throws Throwable {
	   
		driver.get("https://www.amazon.fr/");
	}

	@When("^je faire un mouse hoover sur le text \"([^\"]*)\"$")
	public void je_faire_un_mouse_hoover_sur_le_text(String arg1) throws Throwable {
		
		logoutPageObj.identifierVous();
	}

	@When("^je clique Déconnexion$")
	public void je_clique_Déconnexion() throws Throwable {
		
		logoutPageObj.logoutBtn();
		
		}

	@Then("^se rediriger vers la page login$")
	public void se_déconnécter_et_se_rediriger_vers_la_page_login() throws Throwable {
		
	    String titleAtendu = "S'identifier";
	    
		String titleObtenu = logoutPageObj.loginPage();
	    
		Assert.assertEquals(titleObtenu, titleAtendu);
				
		System.out.println("Automated test completed.");
	}


}
