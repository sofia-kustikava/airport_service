package com.service.airport.exception;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException(String message) {
        super("There is no user " + message);
    }
}
