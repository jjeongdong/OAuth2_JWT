package com.example.securityoauth2jwt.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class UserDTO {

    private String role;

    private String name;

    private String username;
}
