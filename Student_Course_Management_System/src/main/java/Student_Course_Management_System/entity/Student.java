package Student_Course_Management_System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    @ManyToOne  // many student can take only one course
    @JoinColumn(name = "course_id")// which is going to create a foreign key
    private Course course;

}
