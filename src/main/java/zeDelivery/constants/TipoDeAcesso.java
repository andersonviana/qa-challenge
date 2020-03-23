package zeDelivery.constants;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:45
 */
public enum TipoDeAcesso {

    VALIDO(new String[]{"valido", "correct"}),
    INVALIDO(new String[]{"invalido"});

    private String[] apelido;

    private TipoDeAcesso(String[] apelido) {
        this.apelido = apelido;
    }

    public static TipoDeAcesso tipoDeAcessoPorNome(String tipoDeacesso) throws IllegalArgumentException {
        for (TipoDeAcesso ct : values()) {
            for (String a : ct.apelido) {
                if (a.equalsIgnoreCase(tipoDeacesso)) {
                    return ct;
                }
            }
        }
        throw tipoDeAcessoNaoEncontrado(tipoDeacesso);
    }

    private static IllegalArgumentException tipoDeAcessoNaoEncontrado(String ct) {
        return new IllegalArgumentException(("O Tipo de acesso não foi encontrado [" + ct + "]"));
    }
}
