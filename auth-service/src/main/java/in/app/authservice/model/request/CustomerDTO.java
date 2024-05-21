package in.app.authservice.model.request;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
public class CustomerDTO{
    private String name;
    private String email;
    private String address;
    private String gender;
}