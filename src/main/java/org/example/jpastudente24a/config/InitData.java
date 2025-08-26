package org.example.jpastudente24a.config;

import org.example.jpastudente24a.model.Student;
import org.example.jpastudente24a.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        //s1.setId(1);
        s1.setName("Bruce");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        s1.setBornTime(LocalTime.of(10,11,12));
        studentRepository.save(s1);
        s1.setId(0);
        s1.setName("Erik");
        studentRepository.save(s1);
        s1.setId(0);
        s1.setName("Kurt");
        studentRepository.save(s1);
        s1.setName("Jens");
        studentRepository.save(s1);


    }
}
