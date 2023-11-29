package com.senitapqan.EvaluationSystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "t_teachers")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "level")
    private String level;
    @OneToMany(mappedBy = "teacher")
    private List<Lesson> lessons;
}
