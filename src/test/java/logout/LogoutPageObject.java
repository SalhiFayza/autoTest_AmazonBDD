package logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPageObject {
	
    private WebDriver driver;

	final static String BTN_IDENTIFIE_VOUS = "nav-link-accountList-nav-line-1";
	
    final static String BTN_SIGNOUT = "nav-item-signout";

	@FindBy(how = How.ID, using = BTN_IDENTIFIE_VOUS)
	public static WebElement btnIdentifieVous;

	@FindBy(how = How.ID, using = BTN_SIGNOUT)
	public static WebElement btnSignout;
	
	public void identifierVous() {
		
		Actions action = new Actions(driver);
				
		action.moveToElement(btnIdentifieVous).perform();
	}

	public void logout() {

		btnSignout.click();
	}
	
	
    
 
}
