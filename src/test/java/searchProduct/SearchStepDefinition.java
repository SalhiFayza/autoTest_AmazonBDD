package searchProduct;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utils.Setup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition{

	WebDriver driver;
	
	SearchPageObject searchPageObject = new SearchPageObject(); 
	
	public SearchStepDefinition() {

		super();

		driver = Setup.driver; 
		PageFactory.initElements(driver, SearchPageObject.class);
	}
	

	@When("I click on the dropdown list {string}")
	public void iClickOnTheDropdownList(String string) {
		searchPageObject.category_Select();   

	}
	@When("I select the category {string} from the dropdown menu")
	public void iSelectTheCategoryFromTheDropdownMenu(String string) {
		searchPageObject.itemCategory();

	}
	@When("I enter {string} in the search bar")
	public void iEnterInTheSearchBar(String nameProduct) {
		searchPageObject.inputNameProduct(nameProduct);

	}
	@When("I click on the search button")
	public void iClickOnTheSearchButton() {
		searchPageObject.btnSearch();

	}
	@Then("the search results should display {string}")
	public void theSearchResultsShouldDisplay(String expectedMessage) {
		
		String extractedMessage =	searchPageObject.verifNameProduct();
		
		Assert.assertEquals( expectedMessage , extractedMessage );
		
		//System.out.println("Automated test completed.");
	}






}