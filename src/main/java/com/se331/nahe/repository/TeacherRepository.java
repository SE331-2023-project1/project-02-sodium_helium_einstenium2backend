package com.se331.nahe.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.se331.nahe.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAll();

    Page<Teacher> findById(Long id, Pageable page);

    Page<Teacher> findByUser_FirstnameIgnoreCaseContainingOrUser_LastnameIgnoreCaseContainingOrUser_UsernameIgnoreCaseContaining(String firstname,String lastname,String username, Pageable pageRequest);

}
