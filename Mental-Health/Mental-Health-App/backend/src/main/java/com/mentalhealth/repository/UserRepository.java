package com.mentalhealth.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.mentalhealth.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
