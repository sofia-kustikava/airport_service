package com.service.airport.service.impl;

import com.service.airport.dto.AuthDto;
import com.service.airport.dto.TokenDto;
import com.service.airport.entity.UserEntity;
import com.service.airport.exception.IncorrectPasswordException;
import com.service.airport.exception.UserNotExistException;
import com.service.airport.repository.UserRepository;
import com.service.airport.security.JwtProvider;
import com.service.airport.service.IAuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService implements IAuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;

    @Override
    public TokenDto auth(AuthDto authDto) {
        UserEntity user = userRepository.findByEmail(authDto.getEmail())
                .orElseThrow(() -> new UserNotExistException(String.format("%s", authDto.getEmail())));
        if (passwordEncoder.matches(authDto.getPassword(), user.getPassword()))
            return new TokenDto(jwtProvider.generateToken(user));
        throw new IncorrectPasswordException();
    }
}
