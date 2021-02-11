package projetpablo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Form.feature",
glue = { "" }, monochrome = true, dryRun = false)

public class FormTest {

}
