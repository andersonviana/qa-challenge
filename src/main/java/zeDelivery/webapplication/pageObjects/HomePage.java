package zeDelivery.webapplication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import zeDelivery.utils.BrowserDriver;

/**
 * @author anviana
 * @version Anderson Viana: $<br/>
 * 1.0: $
 * @since 21/03/2020 01:31
 */

public class HomePage {

    @FindBy(id = "age-gate-button-yes")
    public WebElement botaIdSIM;

    @FindBy(id = "age-gate-button-no")
    public WebElement botaIdNao;

    @FindBy(id="welcome-button-sign-in")
    public WebElement entrar;

    @FindBy(id ="#HomePage h1")
    public WebElement homePageTitle;

    @FindBy(id ="login-home-email-button-sign-in")
    public WebElement entrarComEmail;

    @FindBy(id ="login-mail-input-email")
    public WebElement emailInputEmail;

    @FindBy(id="login-mail-input-password")
    public WebElement passWordInput;

    @FindBy(id="login-mail-button-sign-in")
    public WebElement enterEmailButtonSignIn;

    @FindBy(id="header-user-badge")
    public WebElement headerUser;

    @FindBy(id="global-message-E-mail não encontrado.")
    public WebElement emailNaoEncontrado;


    public WebElement getUsernameValidationDiv(){
        WebElement parent = BrowserDriver.getParent(BrowserDriver.getParent(emailNaoEncontrado));
        return parent;
    }

}
