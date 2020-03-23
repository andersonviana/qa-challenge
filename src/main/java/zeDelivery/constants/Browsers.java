package zeDelivery.constants;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:35
 */
public enum Browsers {

    FIREFOX,
    CHROME,
    SAFARI;

    public static Browsers navegadores(String browser) throws IllegalArgumentException {
        for (Browsers b : values()) {
            if (b.toString().equalsIgnoreCase(browser)) {
                return b;
            }
        }
        throw browserNaoEncontrado(browser);
    }

    private static IllegalArgumentException browserNaoEncontrado(String browser) {
        return new IllegalArgumentException(("Browser não encontrado " + browser));
    }
}
