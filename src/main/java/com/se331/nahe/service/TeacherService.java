package com.se331.nahe.service;

import com.se331.nahe.security.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.se331.nahe.entity.Teacher;

public interface TeacherService {
    Integer getTeachersSize();

    Page<Teacher> getTeachers(Integer pageSize, Integer page);

    Page<Teacher> getTeachers(String title, Pageable pageable);

    Teacher getTeacher(Long id);

    Teacher save(Teacher teacher);

    User updateTeacher(Long id, User updatedUser);

    Teacher addStudent(Integer studentId, Integer teacherId);
}
