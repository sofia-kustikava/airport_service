package com.service.airport.mapper;

import com.service.airport.config.CustomUserDetails;
import com.service.airport.dto.AuthDto;
import com.service.airport.dto.RegisterDto;
import com.service.airport.dto.UserDto;
import com.service.airport.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto userToDto(UserEntity user);
    List<UserDto> usersToDto (List<UserEntity> users);

    UserEntity dtoToUser(UserDto userDto);
    List<UserEntity> DtoToUsers (List<UserDto> userDtos);

    AuthDto userToAuth(UserEntity user);
    UserEntity authToUser(AuthDto authDto);

    RegisterDto registerUserToDto (UserEntity user);
    RegisterDto dtoToRegisterUser (UserDto userDto);

    CustomUserDetails fromUserEntityToCustomUserDetails(UserEntity user);
}
