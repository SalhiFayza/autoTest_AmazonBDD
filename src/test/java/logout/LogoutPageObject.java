package logout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;

public class LogoutPageObject {

	WebDriver driver = Setup.driver;

	final static String BTN_IDENTIFIE = "nav-link-accountList-nav-line-1";

	final static String BTN_SIGNOUT = "nav-item-signout";

	final static String TITLE_PAGE_CONX = "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1";
	// ******

	@FindBy(how = How.ID, using = BTN_IDENTIFIE)
	public static WebElement identifieVous;

	@FindBy(how = How.ID, using = BTN_SIGNOUT)
	public static WebElement signout;

	@FindBy(how = How.XPATH, using = TITLE_PAGE_CONX)
	public static WebElement verifPageConx;
	
		// ***
	public void identifieVousBtn() {
		
		Actions action = new Actions(driver);
		 action.moveToElement(identifieVous).perform();
		
	}

	public void signoutBtn() {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", signout);
			
		
	}

	public String verifPageConx() {
		String msgObtenu =  verifPageConx.getText();
		
		return msgObtenu;
	}

}
