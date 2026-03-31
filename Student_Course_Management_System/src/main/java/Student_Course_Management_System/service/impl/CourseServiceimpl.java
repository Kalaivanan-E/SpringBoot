package Student_Course_Management_System.service.impl;

import Student_Course_Management_System.entity.Course;
import Student_Course_Management_System.repository.Courserepo;
import Student_Course_Management_System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceimpl implements CourseService {

    @Autowired
    private Courserepo repo;

    public Course createCourse(Course course){
        return  repo.save(course);
    }

    public List<Course> getAllCourse(){
        return repo.findAll();
    }
    public Course getCourseById(Long id){
        return repo.findById(id).orElse(null);
    }
    public Course updateCourse(Long id, Course course){
        Course existingCourse = repo.findById(id).orElse(null);
        existingCourse.setCourseName(course.getCourseName());
        Course saved = repo.save(existingCourse);
        return saved;

    }
    public void deleteCourseById(Long id){
        repo.deleteById(id);
    }
}
