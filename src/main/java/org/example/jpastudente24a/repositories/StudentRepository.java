package org.example.jpastudente24a.repositories;

import org.example.jpastudente24a.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByName(String lastName);

}

