package zeDelivery.webapplication;

import java.util.Properties;

import zeDelivery.constants.TipoDeAcesso;
import zeDelivery.constants.Resultado;
import zeDelivery.webapplication.interation.HomeInteration;
import zeDelivery.utils.BrowserDriver;
import zeDelivery.utils.PropertiesHelper;


/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 02:18
 */

public class AbstractInteration {

    private User user;
    private static Properties properties = PropertiesHelper.getProperties();
    private final static String URL = properties.getProperty("URL");


    public void acceptBrowser() {
        BrowserDriver.clearCookies();
        BrowserDriver.loadPage(URL);
        HomeInteration.isDisplayedCheck();
    }


    public void enterLogin() {
        HomeInteration.clickButtonEnterYes();
        HomeInteration.isDisplayedCheck();
    }

    public void enterWithEmail() {
        HomeInteration.clickButtonEnterWithEmail();
    }

    public void quandoTentoFazerLogin(String tipoDeAcesso) {
        TipoDeAcesso ct = TipoDeAcesso.tipoDeAcessoPorNome(tipoDeAcesso);
        switch (ct) {
            case VALIDO:
                user = Users.createValidUser();
                break;
            case INVALIDO:
                user = Users.createInvalidUser();
                break;
        }
        HomeInteration.login(user.getUsername(), user.getPassword());
    }

    public void EntaoOLogin(String st) {
        Resultado resultado = Resultado.outcomeForName(st);
        switch (resultado) {
            case SUCCESS:
                HomeInteration.validaLoginComSucesso();
                break;
            case FAILURE:
                HomeInteration.validaErroNoLogin();
                break;
        }
    }
}
