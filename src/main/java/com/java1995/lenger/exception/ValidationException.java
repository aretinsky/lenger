package com.java1995.lenger.exception;


public class ValidationException extends Exception {

    private String message;

    public ValidationException(String message) {
    }

    public String getMessage() {
        return message;
    }
}

