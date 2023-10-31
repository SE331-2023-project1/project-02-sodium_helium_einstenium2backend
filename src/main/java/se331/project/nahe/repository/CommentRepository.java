package com.se331.nahe.repository;

import com.se331.nahe.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByStudentId(Long studentId);

    List<Comment> findByStudentIdAndParentCommentIsNull(Long studentId);

    List<Comment> findByStudentId(Long studentId);

    Comment findByParentCommentId(Long id);
}