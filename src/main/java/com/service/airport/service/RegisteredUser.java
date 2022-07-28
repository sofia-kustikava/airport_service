package com.service.airport.service;

import com.service.airport.entity.UserEntity;
import com.service.airport.exception.InvalidJwtException;
import com.service.airport.exception.UserNotFoundException;
import com.service.airport.repository.UserRepository;
import com.service.airport.security.JwtUtils;
import io.jsonwebtoken.JwtException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@RequiredArgsConstructor
public class RegisteredUser {

    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;

    public UserEntity getUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        return userRepository.findByEmail(username).orElseThrow(() -> new UserNotFoundException(username));
    }

    public Long getAuthUserId(HttpServletRequest request) {
        try {
            return jwtUtils.getUserFromToken(request);
        } catch (JwtException e) {
            throw new InvalidJwtException();
        }
    }

}
