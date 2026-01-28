package com.nhannguyenh.simpleshop.service;

import com.nhannguyenh.simpleshop.dto.UserDto;
import com.nhannguyenh.simpleshop.entity.User;
import com.nhannguyenh.simpleshop.mapper.UserMapper;
import com.nhannguyenh.simpleshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User saveUser(UserDto userDto) {
        Optional<User> user = userRepository.findByEmail(userDto.getEmail());
        if (user.isPresent()) {
            log.warn("Email " + userDto.getEmail() + " is existed");
            return user.get();
        }
        return userRepository.save(userMapper.mapToUser(userDto));
    }
}
