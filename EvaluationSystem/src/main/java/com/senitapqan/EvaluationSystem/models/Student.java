package com.senitapqan.EvaluationSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Table(name = "t_students")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "course_number")
    private int courseNumber;

    @ManyToMany(mappedBy = "students")
    private List<Lesson> lessons;

    @OneToMany(mappedBy = "student")
    private List<GradesItem> gradesItems;
}
