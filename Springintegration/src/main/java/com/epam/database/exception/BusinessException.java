package com.epam.database.exception;


public class BusinessException extends RuntimeException {
    private Object error;

    public BusinessException(Object error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Connection was something wrong: \n " + error;
    }
}
