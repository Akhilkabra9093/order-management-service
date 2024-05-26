package in.app.authservice.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailCheck {
    private String email;

    public String getEmail() {
        return email;
    }
}
