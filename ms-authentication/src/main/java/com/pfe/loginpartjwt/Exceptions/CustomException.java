package com.pfe.loginpartjwt.Exceptions;


public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CustomException() {
        super("Wrong username or password");
    }
}
