package com.luv2code.springdemo.rest;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(String cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}