package Student_Course_Management_System.repository;

import Student_Course_Management_System.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student, Long> {
}
