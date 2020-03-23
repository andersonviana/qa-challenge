package zeDelivery.webapplication.interation;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import zeDelivery.webapplication.pageObjects.HomePage;

import zeDelivery.utils.BrowserDriver;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 22:37
 */
public class HomeInteration {

    private static final Logger LOGGER = Logger.getLogger(HomePage.class.getName());
    private static final HomePage homePage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePage.class);

    public static void isDisplayedCheck() {
        LOGGER.info("O botão [Entrar] apareceu na tela");
        BrowserDriver.waitForElement(homePage.entrar);
        homePage.entrar.isDisplayed();
    }

    public static void clickButtonEnterYes() {
        LOGGER.info("Click no botão [ENTRAR] +  clickButtonEnterYes ");
        BrowserDriver.jsClick(homePage.botaIdSIM);
        BrowserDriver.jsClick(homePage.entrar);
    }

    public static void clickButtonEnterWithEmail() {
        LOGGER.info("Click no botão [ENTRAR COM EMAIL]");
        BrowserDriver.jsClick(homePage.entrarComEmail);
    }

    public static void login(String username, String password) {
        BrowserDriver.waitForElement(homePage.emailInputEmail);
        LOGGER.info("login com email:" + username + " senha:" + password);
        homePage.emailInputEmail.sendKeys(username);
        homePage.passWordInput.sendKeys(password);
        BrowserDriver.jsClick(homePage.enterEmailButtonSignIn);
    }

    public static void validaLoginComSucesso() {
        LOGGER.info("Login Realizado com sucesso");
        BrowserDriver.waitForElement(homePage.headerUser);
        homePage.headerUser.isDisplayed();
    }

    public static void validaErroNoLogin() {
        LOGGER.info("Erro ao inserir email e senha invalido");
        BrowserDriver.waitForElement(homePage.getUsernameValidationDiv());
        String mensagemDeErro = homePage.emailNaoEncontrado.getText();
    }

}
