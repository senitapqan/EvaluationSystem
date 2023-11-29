package com.senitapqan.EvaluationSystem.Repository;

import com.senitapqan.EvaluationSystem.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
