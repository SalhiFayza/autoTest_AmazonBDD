package authentification;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private WebDriver driver;

	private AuthentificationPageObject authPageObj = new AuthentificationPageObject();

	public AuthentificationStepDefinition() {

		super();
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPageObject.class);
	}

	@Given("I log in to the application")
	public void iLogInToTheApplication() {

		driver.get("https://www.amazon.fr/");
	}

	@Given("I accept cookies")
	public void iAcceptCookies() {

		authPageObj.cliqAcceptCookies();

	}

	@When("I click on {string}")
	public void iClickOn(String string) {

		authPageObj.signIn();

	}

	@When("I enter the email {string}")
	public void iEnterTheEmail(String email) {

		authPageObj.inputEmail(email);

	}

	@When("I click on the Continue button")
	public void iClickOnTheContinueButton() {

		authPageObj.continueBtn();

	}

	@When("I enter the password {string}")
	public void iEnterThePassword(String password) {

		authPageObj.inputPassword(password);

	}

	@When("I click on the Sign In button")
	public void iClickOnTheSignInButton() {

		authPageObj.signInSubmitBtn();

	}

	@Then("I am redirected to the customer's home page, and {string} is displayed")
	public void iAmRedirectedToTheCustomerSHomePageAndIsDisplayed(String expectedMessage) {

		String extractedMessage = authPageObj.verifMsgObtenu();

		Assert.assertEquals(expectedMessage, extractedMessage);

		// System.out.println("Automated test completed.");
	}

}
