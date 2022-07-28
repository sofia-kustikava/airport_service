package com.service.airport.service;

import com.service.airport.dto.RegisterDto;
import com.service.airport.exception.InvalidUserParameterException;

public interface IRegistrationService {
    void registerUser(RegisterDto register) throws InvalidUserParameterException;
}
