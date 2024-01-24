package com.zmltd.example5.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="student")

public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String grade;

    @ManyToOne
    @JoinColumn(name="course_ID")

    private CourseEntity _courseEntity;

}
