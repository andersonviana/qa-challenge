package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:29
 */
public class Wind {
    private Double speed;
    private Integer deg;

    public Wind(final Double speed, final Integer deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(final Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(final Integer deg) {
        this.deg = deg;
    }
}
