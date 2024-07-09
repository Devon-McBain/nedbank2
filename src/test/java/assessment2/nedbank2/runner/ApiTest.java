package assessment2.nedbank2.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/API.feature",
        glue = "stepDefinition",
        plugin = {"pretty","json:target/reports/report2.json"},
        publish = true,
        dryRun = false
        //monochrome = true,
        //name = ,
        //tags = ,
)

public class ApiTest {
}
