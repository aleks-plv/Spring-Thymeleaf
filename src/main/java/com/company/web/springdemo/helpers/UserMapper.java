package com.company.web.springdemo.helpers;

import com.company.web.springdemo.models.RegisterDto;
import com.company.web.springdemo.models.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {
    public User fromDto (RegisterDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmail(dto.getEmail());

        return user;
    }
}
