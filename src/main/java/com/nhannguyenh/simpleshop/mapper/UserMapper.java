package com.nhannguyenh.simpleshop.mapper;

import com.nhannguyenh.simpleshop.dto.UserDto;
import com.nhannguyenh.simpleshop.entity.Role;
import com.nhannguyenh.simpleshop.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final PasswordEncoder passwordEncoder;

    public User mapToUser(UserDto userDto) {
        return User.builder()
                .email(userDto.getEmail())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .role(Role.USER)
                .build();
    }
}
