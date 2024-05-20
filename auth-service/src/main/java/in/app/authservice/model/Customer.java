package in.app.authservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @NotNull
    private String email;

    @Size(max = 10)
    @NotNull
    @Column(name = "phone_number")
    private Long phoneNumber;

    private String address;

    private String gender;

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt
}