package in.app.authservice.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginCred {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    String username;
    String password;

}
