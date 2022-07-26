package insider.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/default-html-reports",
        features = "src/test/resources/features",
        glue = "insider/step_definitions",
        dryRun = false,
        tags = "@QA_Smoke"
)
public class CukesRunner {
}
