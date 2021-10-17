package com.hackathon.auth.utils.exception;

public class LocationException extends RuntimeException {

    private static final long serialVersionUID = 5861310537366163L;

    public LocationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public LocationException(final String message) {
        super(message);
    }

    public LocationException(final Throwable cause) {
        super(cause);
    }

}
