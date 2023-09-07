package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManager;

	@Before
	/**
	 * Call Browser with the design pattern Factory Navigator
	 */
	public static void setup() {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
	}

	@After
	/**
	 * Embed a screenshot in the test report if test is marked as failed
	 */

	public void embedScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				scenario.write("current page URL is" + driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image.png");
			} catch (WebDriverException somePlateformDontSupportScreenshots) {
				System.err.println(somePlateformDontSupportScreenshots.getMessage());
			}
		}
		//driver.quit();
	}

}
