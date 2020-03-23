package Runner;

import static io.restassured.RestAssured.given;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.apache.http.HttpStatus;
import org.junit.Test;

import zeDelivery.api.obj.WeatherResponse;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 02:03
 */
public class TestApiRunner {

    private RequestSpecification request = given();
    private Response response;
    final String ENDPOINT = "http://api.openweathermap.org/data/2.5/weather";
    final String API_KEY ="3fda1d11f5903b756fbbff896133556c";
    final String CIDADE ="BARUERI";

    @Test
    public void getCidade200() {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        request.baseUri(ENDPOINT);
        request.param("appid", API_KEY);
        request.param("q", CIDADE);
        request.header("Content-Type", "application/json");
        request.urlEncodingEnabled(true);
        response = request
                .when()
                .get(ENDPOINT);
        response.then().statusCode(HttpStatus.SC_OK);
        WeatherResponse wr = new WeatherResponse();
        wr = gson.fromJson(response.getBody().asString(), WeatherResponse.class);
    }

    @Test
    public void getCidade401(){
        request.baseUri(ENDPOINT);
        request.header("Content-Type", "application/json");
        request.param("q",CIDADE);
        request.param("appid","invalido");
        request.urlEncodingEnabled(true);
        response = request
                .when()
                .get(ENDPOINT);
        response.then().statusCode(401);
    }

    @Test
    public void getCidade404(){
        request.baseUri(ENDPOINT);
        request.header("Content-Type", "application/json");
        request.param("q","invalida");
        request.param("appid",API_KEY);
        request.urlEncodingEnabled(true);
        response = request
                .when()
                .get(ENDPOINT);
        response.then().statusCode(HttpStatus.SC_NOT_FOUND);
    }



}
