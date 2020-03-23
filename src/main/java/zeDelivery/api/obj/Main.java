package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:20
 */
public class Main {
    private Double temp;
    private Double feels_like;
    private Double temp_min;
    private Double temp_max;
    private Double pressure;
    private Double humidity;

    public Main(final Double temp, final Double feels_like, final Double temp_min, final Double temp_max, final Double pressure, final Double humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(final Double temp) {
        this.temp = temp;
    }

    public Double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(final Double feels_like) {
        this.feels_like = feels_like;
    }

    public Double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(final Double temp_min) {
        this.temp_min = temp_min;
    }

    public Double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(final Double temp_max) {
        this.temp_max = temp_max;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(final Double pressure) {
        this.pressure = pressure;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(final Double humidity) {
        this.humidity = humidity;
    }
}
