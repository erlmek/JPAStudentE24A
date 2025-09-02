package org.example.jpastudente24a.restcontroller;

import org.example.jpastudente24a.model.Student;
import org.example.jpastudente24a.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/students")
    public List<Student> students() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        Student std = studentRepository.save(student);
        return std;
    }

    @PutMapping("/studentx")
    public Student changeStudentx(@RequestBody Student student) {
        System.out.println(student);
        return studentRepository.save(student);
    }

    @PutMapping("/studentxx")
    public Student changeStudentxx(@RequestBody Student student) {
        Optional<Student> orgStudent = studentRepository.findById(student.getId());
        if (orgStudent.isPresent()) {
            return studentRepository.save(student);
        }  else {
            Student newStudent = new Student();
            newStudent.setName("Not Found");
            return newStudent;
        }
    }

    @PutMapping("/studentxy")
    public ResponseEntity<Student> changeStudentxy(@RequestBody Student student) {
        Optional<Student> orgStudent = studentRepository.findById(student.getId());
        if (orgStudent.isPresent()) {
            studentRepository.save(student);
            return ResponseEntity.ok(student);
        }  else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> changeStudent(@PathVariable int id, @RequestBody Student student) {
        Optional<Student> orgStudent = studentRepository.findById(id);
        if (orgStudent.isPresent()) {
            student.setId(orgStudent.get().getId());
            studentRepository.save(student);
            return ResponseEntity.ok(student);
        }  else {
            return ResponseEntity.notFound().build();
        }
    }




}
