package com.enesergen.e_commerce.exception;

public class ECommerceException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private final int errorCode;

    public ECommerceException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    public int getErrorCode() {
        return errorCode;
    }
    public String getMessage() {
        return super.getMessage();
    }
}
