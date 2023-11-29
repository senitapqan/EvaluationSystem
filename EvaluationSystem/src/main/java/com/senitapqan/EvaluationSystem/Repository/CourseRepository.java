package com.senitapqan.EvaluationSystem.Repository;

import com.senitapqan.EvaluationSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
