package WebAutomation.AutomationBase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Feature"},
        glue = {"WebAutomation"},
        tags = "@logout",
        plugin = {
                "pretty",
                "html:target/report-cucumber.html",
                "json:target/cucumber-json.json"
        }
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {}
