package com.example.springreactdemo.services;

import com.example.springreactdemo.models.Student;
import com.example.springreactdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getPaginatedStudents(int page, int limit) {
        Pageable paging = PageRequest.of(page, limit);
        Page<Student> pagedResults = studentRepository.findAll(paging);
        return pagedResults.toList();
    }

    public Student getStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Student exists with id " + id);
        }
    }

    public Long getStudentsCount() {
        return studentRepository.count();
    }

    public List<Student> createStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            Student newStudent = student.get();
            newStudent.setName(studentDetails.getName());
            return studentRepository.save(newStudent);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Student exists with id " + id);
        }
    }

    public void deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Student exists with id " + id);
        }
    }
}
