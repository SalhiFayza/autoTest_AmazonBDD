package login_searchProducts_logoutE2E;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class E2EStepDefinition {

	private WebDriver driver;

	private E2EPageObject e2EPageObject = new E2EPageObject();

	public E2EStepDefinition() {

		super();

		driver = Setup.driver;

		PageFactory.initElements(driver, E2EPageObject.class);
	}

	@Given("I am on the Login page URL {string}")
	public void iAmOnTheLoginPageURL(String url) {
		driver.get(url);
	}
	@Then("I accept cookies")
	public void iAcceptCookies() {
		e2EPageObject.cliqAcceptCookies();
	}
	@Then("I click on identify yourself")
	public void iClickOnIdentifyYourself() {
	    
	}
	@When("I enter the username as {string}")
	public void iEnterTheUsernameAs(String string) {
	  
	}
	@When("I Click on the Continue button")
	public void iClickOnTheContinueButton() {
	    
	}
	@When("I enter the password as {string}")
	public void iEnterThePasswordAs(String string) {
	   
	}
	@When("I click on the Sign In button")
	public void iClickOnTheSignInButton() {
	  
	}
	@Then("I am redirected to the customer home page, and it says {string}")
	public void iAmRedirectedToTheCustomerHomePageAndItSays(String string) {
	
	}
	@Then("I clear the cart items if any")
	public void iClearTheCartItemsIfAny() {
	    
	}
	@Then("I choose Electronics > Headphones, and the headphones list appears")
	public void iChooseElectronicsHeadphonesAndTheHeadphonesListAppears() {
	   
	}
	@Then("I add the first available headphone to the cart")
	public void iAddTheFirstAvailableHeadphoneToTheCart() {
	    
	}
	@Then("I search for {string} and add the second available item to the cart")
	public void iSearchForAndAddTheSecondAvailableItemToTheCart(String string) {
	  
	}
	@Then("I select the cart from the homepage and remove the previously added headphones")
	public void iSelectTheCartFromTheHomepageAndRemoveThePreviouslyAddedHeadphones() {
	    
	}
	@Then("I reduce the quantity of the Macbook Pro product to one and proceed to checkout")
	public void iReduceTheQuantityOfTheMacbookProProductToOneAndProceedToCheckout() {
	    
	}
	@Then("I hover the mouse over the text {string}")
	public void iHoverTheMouseOverTheText(String string) {
	    
	}
	@Then("I click Log Out")
	public void iClickLogOut() {
	   
	}
	@Then("I am logged out from the application and land on the sign-in page")
	public void iAmLoggedOutFromTheApplicationAndLandOnTheSignInPage() {
	   
	}





}
