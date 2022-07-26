package cbt;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",

        },
        features = "src/test/resources/cbt",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@screen",
        publish = true
)

public class CukesRunner {
}

