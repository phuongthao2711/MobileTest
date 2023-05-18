package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish= true,
        features="src/main/resources/Features/Final.feature",
        glue="StepDefinition",
        tags="@Test"
)

public class RunCukeTest {
}
