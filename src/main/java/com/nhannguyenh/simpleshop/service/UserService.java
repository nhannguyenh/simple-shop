package com.nhannguyenh.simpleshop.service;

import com.nhannguyenh.simpleshop.dto.UserDto;
import com.nhannguyenh.simpleshop.entity.User;
import com.nhannguyenh.simpleshop.mapper.UserMapper;
import com.nhannguyenh.simpleshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User saveUser(UserDto userDto) {
        Optional<User> user = userRepository.findByEmail(userDto.getEmail());
        if (user.isPresent()) {
            throw new IllegalArgumentException(String.format("Email: %s is existed", userDto.getEmail()));
        }
        return userRepository.save(userMapper.mapToUser(userDto));
    }
}
