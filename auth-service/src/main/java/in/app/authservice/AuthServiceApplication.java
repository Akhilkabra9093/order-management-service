package in.app.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "in.app.authservice")
@EnableJpaRepositories(basePackages = "in.app.authservice.repository")
public class AuthServiceApplication {
    public static void main(String[] args) {
        System.out.println("Starting services");
        SpringApplication.run(AuthServiceApplication.class, args);
    }
}
