package Student_Course_Management_System.repository;

import Student_Course_Management_System.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Courserepo extends JpaRepository<Course,Long> {
}
