package Student_Course_Management_System.service.impl;

import Student_Course_Management_System.entity.Course;
import Student_Course_Management_System.entity.Student;
import Student_Course_Management_System.repository.Courserepo;
import Student_Course_Management_System.repository.Studentrepo;
import Student_Course_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private Studentrepo repo;
    @Autowired
    private Courserepo courserepo;

    public Student createStudent(Student student){
        Long CourseId = student.getCourse().getId();
        Course course = courserepo.findById(CourseId).orElse(null);
        student.setCourse(course);
        Student create = new Student(
                student.getId(),
                student.getName(),
                student.getCourse()
        );
        Student saved = repo.save(create);
        return  new Student(
                saved.getId(),
                saved.getName(),
                saved.getCourse()
        );
    }
    public List<Student>getAllStudent(){
        List<Student>get = repo.findAll();
        return get;
    }
    public Student getStudentById(Long id){
        Student get = repo.findById(id).orElseThrow(null);
        return get;
    }
    public Student updateStudent(Long id, Student student){
        Student getid = repo.findById(id).orElseThrow(null);
        getid.setName(student.getName());
        getid.setCourse(student.getCourse());
        Student save = repo.save(getid);
        return new Student(
                save.getId(),
                save.getName(),
                save.getCourse()
        );
    }
    public void deleteStudentById(Long id){
        Student getid = repo.findById(id).orElse(null);
        repo.delete(getid);
    }
}
