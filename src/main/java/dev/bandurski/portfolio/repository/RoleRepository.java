package dev.bandurski.portfolio.repository;

import dev.bandurski.portfolio.model.auth.ERole;
import dev.bandurski.portfolio.model.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
