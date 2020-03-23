package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import zeDelivery.utils.BuilderReport;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/report/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"stepDefinition","hooks"},
        tags = {"@login"})
public class CucumberRunner {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
        BuilderReport.main();
    }
}
