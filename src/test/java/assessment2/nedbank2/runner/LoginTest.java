package assessment2.nedbank2.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "stepDefinition",
        plugin = {"pretty","html:src/test/resources/reports/report1.html"},
        publish = true,
        dryRun = false
        //monochrome = true,
        //name = ,
        //tags = ,
)

public class LoginTest {
}
