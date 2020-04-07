package zeDelivery.api.obj;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:20
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Main {
    private Double temp;
    @SerializedName("feels_like")
    private Double feelsLike;
    @SerializedName("temp_min")
    private Double tempMin;
    @SerializedName("temp_max")
    private Double tempMax;
    private Double pressure;
    private Double humidity;
}
