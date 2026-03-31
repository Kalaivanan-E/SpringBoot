package Student_Course_Management_System.controller;

import Student_Course_Management_System.entity.Student;
import Student_Course_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student create = service.createStudent(student);
        return new ResponseEntity<>(create, HttpStatus.CREATED);
    }
    @GetMapping("getAllStudent")
    public List<Student> getAllStudent(){
        List<Student> get = service.getAllStudent();
        return get;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student get = service.getStudentById(id);
        return new ResponseEntity<>(get,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student update = service.updateStudent(id,student);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id){
        service.deleteStudentById(id);
    }
}
