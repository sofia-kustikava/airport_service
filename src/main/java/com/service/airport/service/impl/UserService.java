package com.service.airport.service.impl;

import com.service.airport.dto.UserDto;
import com.service.airport.entity.UserEntity;
import com.service.airport.exception.UserNotFoundException;
import com.service.airport.mapper.UserMapper;
import com.service.airport.repository.UserRepository;
import com.service.airport.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto findById(Long id) {
        UserEntity user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(String.format("%s", id)));
        return userMapper.userToDto(user);
    }
}
