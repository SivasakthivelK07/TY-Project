package com.tyss.jspiders.sbs.repository;

import com.tyss.jspiders.sbs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
