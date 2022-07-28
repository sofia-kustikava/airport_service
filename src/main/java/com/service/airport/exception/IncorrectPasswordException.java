package com.service.airport.exception;

import javax.persistence.NonUniqueResultException;

public class IncorrectPasswordException extends NonUniqueResultException {
    public IncorrectPasswordException() {
        super("Wrong password");
    }
}
