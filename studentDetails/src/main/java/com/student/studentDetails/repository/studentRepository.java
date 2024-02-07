package com.student.studentDetails.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.student.studentDetails.entity.Student;

public interface studentRepository extends JpaRepository<Student, Integer>{
List<Student> findByName(String name);
	List<Student> findByCity(String city);
	List<Student> findByNameContainingIgnoreCase(final String name);
}
