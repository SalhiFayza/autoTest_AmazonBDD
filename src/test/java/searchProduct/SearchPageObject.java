package searchProduct;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageObject {

	final static String CATEGORY_SELECT = "searchDropdownBox";
	
	final static String OPTION_CATEGORY = "//*[@id=\"searchDropdownBox\"]/option[7]";
	
	final static String  INPUT_SEARCH = "twotabsearchtextbox";
	
	final static String ICON_SEARCH = "nav-search-submit-text";
	
	final static String NAME_PRODUCT = "//*[@id=\"CardInstanceBIi9hc4OOULL4qT2fVRoMw\"]/div[1]/div[2]/div[1]/div/div[2]/a/span/span[2]";
	
	//
	
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
	
	public void btnSearch() {
		// type enter with sendKeys method and pass Keys.ENTER
		//inputSearch.sendKeys(Keys.ENTER);
		
		iconsearch.click();
	}
	
	
	public String verifNameProduct() {
		String nameAtendu =   nameProduct.getText();
		return nameAtendu;
	}
	
	
}
