package com.service.airport.service;

import com.service.airport.dto.AuthDto;
import com.service.airport.dto.TokenDto;

public interface IAuthService {

    TokenDto auth(AuthDto authDto);
}
