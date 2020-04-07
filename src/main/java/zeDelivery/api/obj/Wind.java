package zeDelivery.api.obj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 23/03/2020 00:29
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Wind {
    private Double speed;
    private Integer deg;
}
