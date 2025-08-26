package org.example.jpastudente24a.repositories;

import org.example.jpastudente24a.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneBruce() {
        //List<Student> students = studentRepository.findAll();
        List<Student> students = studentRepository.findByName("Bruce");
        assertEquals(1,students.size());

    }


}