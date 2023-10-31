package com.se331.nahe.security.user;

import lombok.Data;

@Data
public class UserProfileDTO {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
}