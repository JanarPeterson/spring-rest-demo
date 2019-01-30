package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


   private List<Student> students;

   @PostConstruct
   public void loadData(){
       students = new ArrayList<>();
       students.add(new Student("Mati", "Karu"));
       students.add(new Student("Kati", "Karu"));
       students.add(new Student("Jaan", "kivi"));
   }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }


    @GetMapping("/students/{id}")
    public Student getAllStudentById(@PathVariable("id")int id){

        if (id >= students.size() || id < 0){
            throw new StudentNotFoundException("Student id not found - " + id);
        }

        return students.get(id);
    }

}
