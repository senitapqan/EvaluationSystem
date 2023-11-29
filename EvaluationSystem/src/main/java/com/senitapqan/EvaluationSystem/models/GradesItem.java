package com.senitapqan.EvaluationSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_grades_item")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GradesItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "grade_is")
    private Grades grade;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
