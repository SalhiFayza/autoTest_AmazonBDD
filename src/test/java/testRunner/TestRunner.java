package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/authentification/authentification.feature", 
                  glue = {"src/test/java/authentification/AuthentificationStepDefinition.java"}
		)
public class TestRunner {

}
