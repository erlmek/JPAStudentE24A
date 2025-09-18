package org.example.jpastudente24a.repositories;

import org.example.jpastudente24a.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student s1 = new Student();
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        s1.setBornTime(LocalTime.of(10,11,12));
        studentRepository.save(s1);
    }


    @Test
    void testOneBruce() {
        //List<Student> students = studentRepository.findAll();
        List<Student> students = studentRepository.findByName("Bruce");
        assertEquals(1,students.size());
    }


}