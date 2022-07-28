package com.service.airport.controller;

import com.service.airport.dto.AuthDto;
import com.service.airport.dto.TokenDto;
import com.service.airport.service.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final IAuthService authService;

    @PostMapping("/auth")
    public TokenDto auth(@RequestBody AuthDto authDto) {
        return authService.auth(authDto);
    }

}
