package in.app.authservice.repository;

import in.app.authservice.model.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PasswordRepository extends JpaRepository<Password, Long> {

    @Query("SELECT c FROM Password c WHERE c.username = :username")
    Optional<Password> findByUsername(@Param("username") String username);

}