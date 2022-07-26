package com.service.airport.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @NotNull
    @NotEmpty
    private Long id;

    @NotNull
    @NotEmpty
    private  String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private int age;

    @NotNull
    @NotEmpty
    @Email
    private String email;
}
