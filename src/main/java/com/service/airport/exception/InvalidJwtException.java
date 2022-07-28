package com.service.airport.exception;

public class InvalidJwtException extends RuntimeException{
    public InvalidJwtException() {
        super("Invalid token entered");
    }
}