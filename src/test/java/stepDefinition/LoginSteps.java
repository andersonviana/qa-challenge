package stepDefinition;

import java.util.logging.Logger;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import zeDelivery.webapplication.Navegador;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:45
 */

public class LoginSteps {
    private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());

    @Dado("^que estou na home da aplicacao Zé Delivery$")
    public void queEstouNaHomeDaAplicacaoZeDelivery() {
        Navegador.getNavigator().acceptBrowser();
        Navegador.getNavigator().enterLogin();
    }

    @Quando("^clico em entrar com email$")
    public void clicoEmEntrarComEmail() {
        Navegador.getNavigator().enterWithEmail();
    }

    @E("^informo um usuário e senha '(.+)'$")
    public void informoUmUsuarioESenhaType(String ct) {
        Navegador.getNavigator().quandoTentoFazerLogin(ct);
    }

    @Então("^valido o status do login '(.+)'$")
    public void validoOStatusDoLoginStatus(String st) {
        Navegador.getNavigator().EntaoOLogin(st);
    }
}
