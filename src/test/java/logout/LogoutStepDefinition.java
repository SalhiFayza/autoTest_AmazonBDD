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

    @When("I hover the mouse over the {string} icon")
    public void iHoverTheMouseOverTheIcon(String string) {
		logoutPageObject.identifieVousBtn();
		logoutPageObject.signoutBtn();

    }
    @Then("I should be logged out and redirected to the Amazon login page {string}")
    public void iShouldBeLoggedOutAndRedirectedToTheAmazonLoginPage(String expectedMessage) {
      
    	String extractedMessage = logoutPageObject.verifPageConx();

		Assert.assertEquals(expectedMessage, extractedMessage);

		//System.out.println("Automated test completed.");
    }








}









