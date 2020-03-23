package zeDelivery.utils;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import zeDelivery.constants.Browsers;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:03
 */
public class BrowserFactory {

    public static Properties properties = PropertiesHelper.getProperties();
    private static final String NAVEGADOR = properties.getProperty("browser");

    public static WebDriver getBrowser() {
        Browsers browser;
        WebDriver driver;

        if (System.getProperty(NAVEGADOR) == null) {
            browser = Browsers.FIREFOX;
        } else {
            browser = Browsers.navegadores(System.getProperty(NAVEGADOR));
        }
        switch (browser) {
            case FIREFOX:
                driver = createFirefoxDriver();
                break;
            case SAFARI:
                driver = createSafariDriver();
                break;
            case CHROME:
            default:
                driver = createChromeDriver();
                break;
        }
        setConfigBrowser(driver);
        return driver;
    }

    private static WebDriver createSafariDriver() {
        return new SafariDriver();
    }

    private static WebDriver createChromeDriver() {
        WebDriverManager.getInstance(CHROME).setup();
        return new ChromeDriver();
    }

    private static WebDriver createFirefoxDriver() {
        WebDriverManager.getInstance(FIREFOX).setup();
        return new FirefoxDriver();
    }


    private static void setConfigBrowser(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

}
