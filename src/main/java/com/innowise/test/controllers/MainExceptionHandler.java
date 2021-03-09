package com.innowise.test.controllers;

import com.innowise.test.exceptions.BadIncomeFileException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class MainExceptionHandler {

    @ExceptionHandler(value = {BadIncomeFileException.class})
    public ResponseStatusException handle(BadIncomeFileException exception) {
        return new ResponseStatusException(HttpStatus.BAD_REQUEST, exception.getMessage(), exception);
    }
}