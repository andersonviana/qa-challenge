package zeDelivery.webapplication;

import java.util.Properties;

import zeDelivery.utils.PropertiesHelper;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 01:25
 */

public class Users {

    public static Properties properties = PropertiesHelper.getProperties();
    public final static String USERNAME_VALID = properties.getProperty("USER");
    public final static String PASSWORD_VALID = properties.getProperty("PASS");


    public static User createValidUser() {
        User user = new User();
        user.withUserName(USERNAME_VALID).withPassword(PASSWORD_VALID);
        return user;
    }

    public static User createInvalidUser() {
        User user = new User();
        user.withUserName("email@email.com").withPassword("senhainvalida");
        return user;
    }
}
