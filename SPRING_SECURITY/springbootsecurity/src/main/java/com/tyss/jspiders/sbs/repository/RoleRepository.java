package com.tyss.jspiders.sbs.repository;

import com.tyss.jspiders.sbs.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, String> {

    Optional<Role> findByRoleName(String roleAdmin);
}
