package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 22/03/2020 23:53
 */
public class Coord {
    private Double lon;
    private Double lat;

    public Coord(final Double lon, final Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(final Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(final Double lat) {
        this.lat = lat;
    }
}
