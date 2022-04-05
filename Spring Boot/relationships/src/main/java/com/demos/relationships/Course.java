package com.demos.relationships;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

//    private Teacher teacher;
//
//    private CourseMaterial courseMaterial;
//
//    private List<Student> students;
}
