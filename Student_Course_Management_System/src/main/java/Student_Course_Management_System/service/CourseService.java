package Student_Course_Management_System.service;

import Student_Course_Management_System.entity.Course;
import Student_Course_Management_System.entity.Student;

import java.util.List;

public interface CourseService {
    Course createCourse(Course course);
    List<Course> getAllCourse();
    Course getCourseById(Long id);
    Course updateCourse(Long id, Course course);
    void deleteCourseById(Long id);
}
