package zeDelivery.webapplication;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 22:12
 */
public class Navegador {
    private static AbstractInteration navigator = null;

    public static synchronized AbstractInteration getNavigator() {
        if (navigator == null) {
            navigator = new AbstractInteration();
        }
        return navigator;
    }
}
