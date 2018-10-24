package Reto3.RunnerTags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/CotizacionLeasing.feature",
		tags= "@tag",
		glue="Reto3.StepDefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {
}
