package com.kalana.dto;

import com.kalana.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;
}
