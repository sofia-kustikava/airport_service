package com.service.airport.service;

import com.service.airport.dto.UserDto;

public interface IUserService {
    UserDto findById(Long id);
}
