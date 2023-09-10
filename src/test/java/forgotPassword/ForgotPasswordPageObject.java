package forgotPassword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPageObject {

	final static String ACCEPT_COOKIES = "sp-cc-accept";

	final static String BTN_IDENTIFIE_VOUS = "nav-link-accountList-nav-line-1";

	final static String INPUT_EMAIL = "ap_email";

	final static String BTN_CONTINUE = "continue";

	final static String LINK_FORGOT_PASSWORD = "auth-fpp-link-bottom";

	final static String INPUT_EMAIL_VERIF = "ap_email";

	final static String BTN_CONTINUE_VERIF = "continue";

	final static String CODE_OTP = "cvf-input-code";

	final static String BTN_OTP = "cvf-submit-otp-button";

	final static String NEW_PASSWORD = "ap_fpp_password";

	final static String NEW_PASSWORD_CHECK = "ap_fpp_password_check";

	final static String BTN_SAVE_UPDATE = "a-autoid-0-announce";

	final static String LINK_BTN_SKIP = "cvf-skip-claim-collect-section";

	final static String ACCEPT_COOKIES_2 = "sp-cc-accept";
    
	final static String SUCCES = "//*[@id=\"cvf-page-content\"]/div/div/div[1]/div/div/div";
	
	// ************

	@FindBy(how = How.ID, using = ACCEPT_COOKIES)
	public static WebElement acceptCookiesBtn;

	@FindBy(how = How.ID, using = BTN_IDENTIFIE_VOUS)
	public static WebElement btnIdentifieVous;

	@FindBy(how = How.ID, using = INPUT_EMAIL)
	public static WebElement inputEmail;

	@FindBy(how = How.ID, using = BTN_CONTINUE)
	public static WebElement btnContinue;

	@FindBy(how = How.ID, using = LINK_FORGOT_PASSWORD)
	public static WebElement linkForgotPassword;

	@FindBy(how = How.ID, using = INPUT_EMAIL_VERIF)
	public static WebElement emailVerif;

	@FindBy(how = How.ID, using = BTN_CONTINUE_VERIF)
	public static WebElement btnContinueVerif;

	@FindBy(how = How.ID, using = CODE_OTP)
	public static WebElement codeOTP;

	@FindBy(how = How.ID, using = BTN_OTP)
	public static WebElement btnOTP;

	@FindBy(how = How.ID, using = NEW_PASSWORD)
	public static WebElement newPassword;

	@FindBy(how = How.ID, using = NEW_PASSWORD_CHECK)
	public static WebElement newPasswordCheck;

	@FindBy(how = How.ID, using = BTN_SAVE_UPDATE)
	public static WebElement btnSaveUpdate;

	@FindBy(how = How.ID, using = LINK_BTN_SKIP)
	public static WebElement skip;

	@FindBy(how = How.ID, using = ACCEPT_COOKIES_2)
	public static WebElement acceptCookies2;
	

	@FindBy(how = How.ID, using = SUCCES)
	public static WebElement succes;
	
	// **************

	public void cliqAcceptCookies() {

		acceptCookiesBtn.click();
	}

	public void identifierVous() {

		btnIdentifieVous.click();
	}

	public void inputEmail(String email) {

		inputEmail.sendKeys(email);
	}

	public void continueBtn() {
		btnContinue.click();

	}

	public void linkForgotPassword() {

		linkForgotPassword.click();

	}

	public void emailVerif(String email) {

		emailVerif.sendKeys(email);
	}

	//*****
	public String emailVerifObtenu() {

		return emailVerif.getText();
	}

	public void btnContinueVerif() {

		btnContinueVerif.click();
	}

	public void codeOTP(String code_otp) {

		codeOTP.sendKeys(code_otp);
	}

	public void btnOTP() {

		btnOTP.click();
	}

	public void newPassword(String new_password) {

		newPassword.sendKeys(new_password);
	}

	public void newPasswordCheck(String new_password_check) {

		newPasswordCheck.sendKeys(new_password_check);
	}

	public void btnSaveUpdate() {

		btnSaveUpdate.click();
	}

	public void skip() {

		skip.click();
	}

	public void cliqAcceptCookies2() {

		acceptCookies2.click();
	}
	
	public String succes() {
		
	return succes.getText();
	
	}
}
