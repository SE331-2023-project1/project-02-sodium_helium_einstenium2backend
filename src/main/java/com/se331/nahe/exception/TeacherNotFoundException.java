package com.se331.nahe.exception;

public class TeacherNotFoundException extends RuntimeException {
    public TeacherNotFoundException(Long id) {
        super("Teacher with ID " + id + " not found");
    }
}
