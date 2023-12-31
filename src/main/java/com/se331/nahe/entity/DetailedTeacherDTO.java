package com.se331.nahe.entity;

import com.se331.nahe.security.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailedTeacherDTO {
    Long id;  // User ID
    String username;
    String firstname;
    String lastname;
    String email;
    List<Role> roles = new ArrayList<>();

    // Fields from TeacherDTO
    String image;
    String department;
    List<TeacherOwnStudentDTO> ownStudent = new ArrayList<>();
}