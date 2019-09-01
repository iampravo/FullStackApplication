package com.pravinsingh.apps.fullstackapp.exception;

public class FullStackAppException extends RuntimeException {
    public FullStackAppException() {
        super();
    }

    public FullStackAppException(String message) {
        super(message);
    }

    public FullStackAppException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullStackAppException(Throwable cause) {
        super(cause);
    }

    protected FullStackAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
