package zeDelivery.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 12:14
 */
public final class PropertiesHelper {

    public static Properties getProperties() {
        Properties propertiesProperties = new Properties();
        FileInputStream fileProperties;
        try {
            fileProperties = new FileInputStream("config.properties");
            InputStreamReader readerProperties = new InputStreamReader(fileProperties, "UTF-8");
            propertiesProperties.load(readerProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertiesProperties;
    }
}
