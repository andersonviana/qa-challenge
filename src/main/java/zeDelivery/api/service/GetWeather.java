/*

package zeDelivery.api.service;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.http.HttpStatus;

import zeDelivery.api.obj.WeatherResponse;


*/
/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 01:06
 *//*


public class GetWeather {
    private WeatherResponse weatherResponse;
    private RequestSpecification request = given();
    private Response response;


    private static String ENDPOINT = "http://api.openweathermap.org/data/2.5/weather";
    private static String API_KEY ="3fda1d11f5903b756fbbff896133556c";

    public GetWeather(String c) {
        super();
        this.weatherResponse = start(c);

    }

    public WeatherResponse start(String cidade) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        request.baseUri(ENDPOINT);
        request.param( "appid", API_KEY);
        request.param("q",cidade);
        request.header("Content-Type", "application/json");
        request.urlEncodingEnabled(true);

        response = request
                .when()
                .get(ENDPOINT);
                response.then().statusCode(HttpStatus.SC_OK);

                WeatherResponse wr = new WeatherResponse();
      wr =  gson.fromJson(response.getBody().asString(), WeatherResponse.class);
      return wr;
    }

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public Response getResponse() {
        return response;
    }
}



*/
