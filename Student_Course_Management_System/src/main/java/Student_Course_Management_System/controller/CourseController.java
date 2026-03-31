package Student_Course_Management_System.controller;

import Student_Course_Management_System.entity.Course;
import Student_Course_Management_System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/course")
public class CourseController {
    @Autowired
    private CourseService service;

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course){
        return service.createCourse(course);
    }
    @GetMapping("/getAllCourse")
    public List<Course> getAllCourse(){
        return service.getAllCourse();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id){
        return service.getCourseById(id);
    }
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course){
        return service.updateCourse(id,course);
    }
    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable Long id){
        service.deleteCourseById(id);
    }
}
