package com.demos.relationships.finished;

import javax.persistence.*;

@Entity
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    @OneToOne
    private Course course;
}
