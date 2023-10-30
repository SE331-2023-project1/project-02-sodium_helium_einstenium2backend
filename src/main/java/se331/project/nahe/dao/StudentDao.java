package se331.project.nahe.dao;

import se331.project.nahe.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface StudentDao {

    Integer getStudentSize();
    Student save(Student student);
    Page<Student> getStudents(Integer pageSize, Integer page);
    Page<Student> getStudents(String name, Pageable page);
    Student getStudent(Long id);

    
}
