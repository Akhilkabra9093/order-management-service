package in.app.authservice.model;

import javax.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
    private LocalDateTime createdAt;
}