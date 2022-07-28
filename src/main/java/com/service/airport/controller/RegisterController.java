package com.service.airport.controller;

import com.service.airport.dto.RegisterDto;
import com.service.airport.exception.InvalidUserParameterException;
import com.service.airport.service.impl.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class RegisterController {
    private final RegistrationService registrationService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody @Valid RegisterDto registerDto)
            throws InvalidUserParameterException {
        registrationService.registerUser(registerDto);
        return new ResponseEntity<>("Welcome " + registerDto.getEmail(), HttpStatus.OK);
    }
}
