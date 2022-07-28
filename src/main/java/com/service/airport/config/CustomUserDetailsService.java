package com.service.airport.config;

import com.service.airport.entity.UserEntity;
import com.service.airport.exception.UserNotFoundException;
import com.service.airport.mapper.UserMapper;
import com.service.airport.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserDetails loadUserByUsername(String email) throws UserNotFoundException {
        Optional<UserEntity> userOptional = userRepository.findByEmail(email);
        UserEntity user = userOptional.orElseThrow(() -> new UserNotFoundException(email));
        user.getRoles().forEach(role -> log.info("Reading roles"));
        return userMapper.fromUserEntityToCustomUserDetails(user);
    }
}
