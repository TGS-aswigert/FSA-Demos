package com.demos.relationships;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

//    private Course course;
}
