package searchProduct;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageObject {

	final static String CATEGORY_SELECT = "searchDropdownBox";
	
	final static String OPTION_CATEGORY = "//*[@id=\"searchDropdownBox\"]/option[27]";
	
	final static String  INPUT_SEARCH = "twotabsearchtextbox";
	
	final static String ICON_SEARCH = "nav-search-submit-text";
	
	final static String NAME_PRODUCT = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a";
	
	
	@FindBy(how = How.ID, using = CATEGORY_SELECT )
	public static WebElement categorySelect;
	
	@FindBy(how = How.XPATH, using = OPTION_CATEGORY )
	public static WebElement optionCategory;
	
	@FindBy(how = How.ID, using = INPUT_SEARCH )
	public static WebElement inputSearch;
	
	@FindBy(how = How.ID, using = ICON_SEARCH)
	public static WebElement iconsearch;
	
	@FindBy(how = How.XPATH, using = NAME_PRODUCT)
	public static WebElement nameProduct;
	
	//
	
	public void category_Select() {
		
		categorySelect.click();
	}
	
	public void itemCategory() {
		
		optionCategory.click();
	}

	
	public void inputNameProduct(String inputProduct) {
		
		inputSearch.sendKeys(inputProduct);
	}

	public void enterKeyBoard() {
		// type enter with sendKeys method and pass Keys.ENTER
				inputSearch.sendKeys(Keys.ENTER);
				
	}
	// icon Btn
	public void btnSearch() {
		
		iconsearch.click();
	}
	
	
	public String verifNameProduct() {
		
		return nameProduct.getText();		
		
	}
	
	
}