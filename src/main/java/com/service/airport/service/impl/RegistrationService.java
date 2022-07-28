package com.service.airport.service.impl;

import com.service.airport.dto.RegisterDto;
import com.service.airport.entity.RoleEntity;
import com.service.airport.entity.UserEntity;
import com.service.airport.exception.InvalidUserParameterException;
import com.service.airport.repository.RoleRepository;
import com.service.airport.repository.UserRepository;
import com.service.airport.service.IRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class RegistrationService implements IRegistrationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(RegisterDto register) throws InvalidUserParameterException {
        if (emailExist(register.getEmail())) throw new RuntimeException("user id already exist");
        try {
            UserEntity user = UserEntity.builder()
                    .firstName(register.getFirstName())
                    .lastName(register.getLastName())
                    .age(register.getAge())
                    .passport(register.getPassport())
                    .email(register.getEmail())
                    .password(passwordEncoder.encode(register.getPassword()))
                    .build();
            RoleEntity userRole = roleRepository.findByRoleName("USER");
            user.setRoles(Collections.singletonList(userRole));

            userRepository.save(user);
        } catch (Exception e) {
            throw new InvalidUserParameterException(e.getMessage());
        }
    }

    private boolean emailExist(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
