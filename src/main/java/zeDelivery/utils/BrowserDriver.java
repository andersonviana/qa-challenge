package zeDelivery.utils;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:00
 */

public class BrowserDriver {
    private static final Logger LOGGER = Logger.getLogger(BrowserDriver.class.getName());
    private static WebDriver mDriver;

    public synchronized static WebDriver getCurrentDriver() {
        if (mDriver == null) {
            try {
                mDriver = BrowserFactory.getBrowser();
            } catch (UnreachableBrowserException e) {
                mDriver = BrowserFactory.getBrowser();
            } catch (WebDriverException e) {
                mDriver = BrowserFactory.getBrowser();
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        return mDriver;
    }

    public static void close() {
        try {
            getCurrentDriver().close();
            mDriver = null;
            LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            close();
        }
    }

    public static void loadPage(String url) {
        getCurrentDriver();
        LOGGER.info("Direcionando para o Endereço" + url);
        LOGGER.info("Carrregando o endereço [" + url + "]");
        getCurrentDriver().get(url);
    }

    public static WebElement waitForElement(WebElement elementToWaitFor) {
        return waitForElement(elementToWaitFor, null);
    }

    public static WebElement waitForElement(WebElement elementToWaitFor, Integer waitTimeInSeconds) {
        if (waitTimeInSeconds == null) {
            waitTimeInSeconds = 10;
        }

        WebDriverWait wait = new WebDriverWait(getCurrentDriver(), waitTimeInSeconds);
        return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
    }


    public static void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getCurrentDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public static WebElement getParent(WebElement element) {
        return element.findElement(By.xpath(".."));
    }

    public static void clearCookies() {
        getCurrentDriver().manage().deleteAllCookies();
    }

}

