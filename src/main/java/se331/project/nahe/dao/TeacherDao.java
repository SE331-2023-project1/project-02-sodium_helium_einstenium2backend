package com.se331.nahe.dao;

import com.se331.nahe.entity.Teacher;
import com.se331.nahe.security.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface TeacherDao {
    Integer getTeacherSize();
    Teacher save(Teacher teacher);
    Page<Teacher> getTeachers(Integer pageSize, Integer page);
    Page<Teacher> getTeachers(String name, Pageable page);
    Teacher getTeacher(Long id);

    User updateTeacher(Long id, User updatedUser);

    Teacher addStudent(Integer studentId, Integer teacherId);
}
