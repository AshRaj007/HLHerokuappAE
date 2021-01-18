import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        tags = {"@table1test, @table2test"},
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "pretty:target/cucumber-pretty-report.txt"
        })

public class CucumberRunner {
}
