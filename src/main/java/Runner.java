import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/", glue="stepDefinition", tags = "@smoke", plugin = { "pretty", "html:target/cucumber-reports.html" })
public class Runner {

}
