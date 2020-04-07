package zeDelivery.api.obj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:33
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sys {
    private Integer type;
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;

}
