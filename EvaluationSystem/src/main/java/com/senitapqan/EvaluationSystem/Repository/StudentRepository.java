package com.senitapqan.EvaluationSystem.Repository;

import com.senitapqan.EvaluationSystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
