import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "pretty:target/cucumber-pretty-report.txt"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        tags = "@table1test"
        )

public class CucumberRunner {
}
