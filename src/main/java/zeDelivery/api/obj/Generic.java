package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:46
 */
public class Generic {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public Generic(final Integer id, final String main, final String description, final String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(final String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(final String icon) {
        this.icon = icon;
    }
}
