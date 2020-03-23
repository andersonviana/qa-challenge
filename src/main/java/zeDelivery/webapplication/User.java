package zeDelivery.webapplication;

/**
 * @author anviana
 * @version : $<br/>
 * : $
 * @since 21/03/2020 22:54
 */
public class User {
    public String username;
    public String password;

    public User withUserName(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

}
