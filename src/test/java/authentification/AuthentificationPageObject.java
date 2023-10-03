package authentification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPageObject {

	final static String ACCEPT_COOKIES = "sp-cc-accept";

	final static String BTN_SIGN_IN = "nav-link-accountList-nav-line-1";

	final static String INPUT_EMAIL = "ap_email";

	final static String BTN_CONTINUE = "continue";

	final static String INPUT_PASSWORD = "ap_password";

	final static String BTN_SIGNINSUBMIT = "signInSubmit";

	final static String VERIF_MSG = "nav-link-accountList-nav-line-1";


	@FindBy(how = How.ID, using = ACCEPT_COOKIES)
	public static WebElement acceptCookiesBtn;

	@FindBy(how = How.ID, using = BTN_SIGN_IN)
	public static WebElement btnSignIn;

	@FindBy(how = How.ID, using = INPUT_EMAIL)
	public static WebElement inputEmail;

	@FindBy(how = How.ID, using = BTN_CONTINUE)
	public static WebElement btnContinue;

	@FindBy(how = How.ID, using = INPUT_PASSWORD)
	public static WebElement inputPassword;

	@FindBy(how = How.ID, using = BTN_SIGNINSUBMIT)
	public static WebElement btnSignInSubmit;

	@FindBy(how = How.ID, using = VERIF_MSG)
	public static WebElement verifMsg;


	public void cliqAcceptCookies() {
		acceptCookiesBtn.click();
	}

	public void signIn() {

		btnSignIn.click();
	}

	public void inputEmail(String email) {

		inputEmail.sendKeys(email);
	}

	public void continueBtn() {
		btnContinue.click();

	}

	public void inputPassword(String password) {

		inputPassword.sendKeys(password);
	}

	public void signInSubmitBtn() {
		
		btnSignInSubmit.click();
	} 

	public String verifMsgObtenu() {
		
        String extractedMessage = verifMsg.getText();
        
		return extractedMessage;
	}

}