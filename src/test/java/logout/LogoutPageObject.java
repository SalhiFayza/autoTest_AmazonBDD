package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPageObject {
	private WebDriver driver;

	final static String BTN_IDENTIFIE = "nav-link-accountList";

	final static String BTN_SIGNOUT = "nav-item-signout";

	final static String TITLE_PAGE_CONX = "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1";

	// ******

	@FindBy(how = How.ID, using = BTN_IDENTIFIE)
	public static WebElement identifie;

	@FindBy(how = How.ID, using = BTN_SIGNOUT)
	public static WebElement signout;

	@FindBy(how = How.XPATH, using = TITLE_PAGE_CONX)
	public static WebElement verifPageConx;
	  
	public void identifieVousBtn() {
		Actions action = new Actions(driver);
		action.moveToElement(identifie).perform();
		
	}

	public void signoutBtn() {

		signout.click();
	}

	public String verifPageConx() {

		return verifPageConx.getText();

	}
}
