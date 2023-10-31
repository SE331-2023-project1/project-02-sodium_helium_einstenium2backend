package com.se331.nahe.dao;

import com.se331.nahe.entity.Student;
import com.se331.nahe.entity.StudentDTO;
import com.se331.nahe.entity.Teacher;
import com.se331.nahe.security.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentDao {
    Integer getStudentSize();
    Student save(Student student);
    Page<Student> getStudents(Integer pageSize, Integer page);
    Page<Student> getStudents(String filter, Pageable page);
    Student getStudent(Long id);
    User updateStudent(Long id, User updatedUser);
    //    Teacher getTeacherOfStudent(Long studentId);
}
