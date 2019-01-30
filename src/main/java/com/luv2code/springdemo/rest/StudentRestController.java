package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Mati", "Karu"));
        students.add(new Student("Kati", "Karu"));
        students.add(new Student("Jaan", "kivi"));

        return students;
    }
}
