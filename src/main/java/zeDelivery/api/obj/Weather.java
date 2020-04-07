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
 * @since 23/03/2020 00:16
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;

}
