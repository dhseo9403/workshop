package com.test.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.entity.Student;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("student")
    public ResponseEntity<Student> getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setFirstName("dh");
        student.setLastName("seo");
        return ResponseEntity.ok().header("custom-header", "dhseo").body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "dhseo1", "ddd"));
        students.add(new Student(2, "dhseo2", "ddd"));
        return ResponseEntity.ok(students);
    }

    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id")int studentId, 
                                                    @PathVariable("first-name")String firstName, 
                                                    @PathVariable("last-name")String lastName){
        Student student = new Student(1,"dheseo","ddd");
        return ResponseEntity.ok(student);
    }

    // /query?id=1&firstName=dhseo&lastName=eee
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestVariable(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName){
        Student student = new Student(1,"dhseo","eee");
        return ResponseEntity.ok(student);
    }

    /*
    {
        "id" : 1,
        "firstName" : "dhseo",
        "lastName" : "fff"
    }
    */
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName());
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")int studentId){
        System.out.println("deleted id " + studentId);
        return ResponseEntity.ok("Student deleted");
    }

    /*
    {
        "id" : 1,
        "firstName" : "dhseo",
        "lastName" : "ggg"
    }
    */
    @PutMapping("update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id")int studentId){
        System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName());
        return ResponseEntity.ok(student);
    }
}
