package org.example.jpastudente24a.restcontroller;

import org.example.jpastudente24a.model.Student;
import org.example.jpastudente24a.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/students")
    public List<Student> students() {
        List<Student> students = studentRepository.findAll();
        return students;
    }


}
