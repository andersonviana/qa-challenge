package hooks;

import java.util.Properties;

import org.junit.AfterClass;

import zeDelivery.utils.BuilderReport;
import zeDelivery.utils.Utils;

import cucumber.api.java.After;
import cucumber.api.Scenario;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 22/03/2020 22:20
 */

public class Hooks {
    public static Properties properties = new Properties();

    @After
    public static void afterWeb(Scenario scenario) {
    }

    @AfterClass
    public static void report() {
        BuilderReport.main();
    }

    @AfterStep
    public static void afterStep(Scenario scenario) {
        Utils.embeddImagesInReport(scenario);
    }

    @Before
    public void beforeWeb(Scenario scenario) {
        properties.setProperty("scenario", scenario.getName());
    }
}
