package com.senitapqan.EvaluationSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_lesson_items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LessonItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}
