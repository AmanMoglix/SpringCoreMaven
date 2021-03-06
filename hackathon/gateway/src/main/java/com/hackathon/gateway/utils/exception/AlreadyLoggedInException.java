package com.hackathon.gateway.utils.exception;


public class AlreadyLoggedInException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366163L;

    public AlreadyLoggedInException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public AlreadyLoggedInException(final String message) {
        super(message);
    }

    public AlreadyLoggedInException(final Throwable cause) {
        super(cause);
    }

}
