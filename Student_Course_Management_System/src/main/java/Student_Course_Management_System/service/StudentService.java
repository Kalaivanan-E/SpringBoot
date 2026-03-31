package Student_Course_Management_System.service;

import Student_Course_Management_System.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    void deleteStudentById(Long id);
}
