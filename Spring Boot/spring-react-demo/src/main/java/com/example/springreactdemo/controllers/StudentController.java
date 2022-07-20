package com.example.springreactdemo.controllers;

import com.example.springreactdemo.models.Student;
import com.example.springreactdemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Student> getPaginatedStudents(@RequestParam int page,
                                              @RequestParam int limit) {
        return studentService.getPaginatedStudents(page, limit);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Student getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/count")
    @CrossOrigin(origins = "http://localhost:3000")
    public Long getStudentCount() {
        return studentService.getStudentsCount();
    }

    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Student> createStudents(@RequestBody List<Student> students) {
        return studentService.createStudents(students);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

}
