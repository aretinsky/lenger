package com.java1995.spring_crud.exception;

public class ValidationException extends Exception {

    private String message;

    public ValidationException(String message) {

    }

    public String getMessage() {
        return message;
    }
}
