package com.tyss.jspiders.sbs.repository;

import com.tyss.jspiders.sbs.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, String> {
}
