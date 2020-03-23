package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:33
 */
public class Sys {
    private Integer type;
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;

    public Sys(final Integer type, final Integer id, final String country, final Integer sunrise, final Integer sunset) {
        this.type = type;
        this.id = id;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getType() {
        return type;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(final Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(final Integer sunset) {
        this.sunset = sunset;
    }
}
