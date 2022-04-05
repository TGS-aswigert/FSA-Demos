package com.demos.relationships.finished;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
