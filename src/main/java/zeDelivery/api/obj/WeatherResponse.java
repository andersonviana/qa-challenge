package zeDelivery.api.obj;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:59
 */
public class WeatherResponse {
    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private Sys sys;
    private Long timezone;
    private Integer id;
    private String name;
    private Integer cod;

    public WeatherResponse(final Coord coord, final Weather[] weather, final String base, final Main main, final Integer visibility, final Wind wind, final Clouds clouds, final Long dt, final Sys sys, final Long timezone, final Integer id, final String name, final Integer cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public WeatherResponse(){
        //ContrutorVazio

    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(final Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(final Weather[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(final String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(final Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(final Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(final Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(final Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(final Long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(final Sys sys) {
        this.sys = sys;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(final Long timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(final Integer cod) {
        this.cod = cod;
    }
}
