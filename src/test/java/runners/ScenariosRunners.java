package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       // features = "src/test/resources/Features/Scenarios.feature",
        features = "src/test/resources/Features/ScenariosOutline.feature",
        glue = {"StepDefinitions","Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,tags = "@Compra")



public class ScenariosRunners {
}