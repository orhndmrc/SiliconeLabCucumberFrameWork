package runnerTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
// This creates cucumber reports
        features = "@rerun/failed_scenarios.txt",
        glue = {"stepdefinition"},
        plugin = {"pretty", "json:target/cucumber_rerun.json"}
)
public class TestReRunner extends AbstractTestNGCucumberTests {
    //dont write any codes here
}
