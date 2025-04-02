package vn.id.kieuanhdev.fourm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.id.kieuanhdev.fourm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
