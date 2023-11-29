package com.senitapqan.EvaluationSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_grades")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lesson_item_id")
    private Lesson lesson;

    @OneToMany(mappedBy = "grade")
    private List<GradesItem> gradesItems;

}
