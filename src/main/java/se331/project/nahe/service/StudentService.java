package com.se331.nahe.service;

import com.se331.nahe.entity.StudentDTO;
import com.se331.nahe.entity.Teacher;
import com.se331.nahe.security.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.se331.nahe.entity.Student;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentService {
    Integer getStudentsSize();

    Page<Student> getStudents(Integer pageSize, Integer page);

    Page<Student> getStudents(String filter, Pageable pageable);

    Student getStudent(Long id);

    Student save(Student student);

    User updateStudent(Long id, User user);

    User findUserByStudentId(Long studentUserId);

    Page<Student> getStudentTeacherIsNull(Integer perPage, Integer page);
}
