package vn.id.kieuanhdev.fourm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.id.kieuanhdev.fourm.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
