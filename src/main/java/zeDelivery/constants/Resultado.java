package zeDelivery.constants;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 02:38
 */
public enum Resultado {

    SUCCESS(new String[]{"success", "successfully"}),
    FAILURE(new String[]{"failure", "unsuccessfully"});

    private String[] aliases;

    private Resultado(String[] aliases) {
        this.aliases = aliases;
    }

    public static Resultado outcomeForName(String outcomeString) throws IllegalArgumentException {
        for (Resultado resultado : values()) {
            for (String alias : resultado.aliases) {
                if (alias.equalsIgnoreCase(outcomeString)) {
                    return resultado;
                }
            }
        }
        throw outcomeNotFound(outcomeString);
    }

    private static IllegalArgumentException outcomeNotFound(String outcome) {
        return new IllegalArgumentException(("Invalid outcome [" + outcome + "]"));
    }
}
