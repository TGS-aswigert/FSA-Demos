package com.demos.relationships.finished;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Teacher teacher;

    @OneToOne(mappedBy = "course")
    private CourseMaterial courseMaterial;

    @ManyToMany
    @JoinTable(
            name = "students_courses",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;
}
