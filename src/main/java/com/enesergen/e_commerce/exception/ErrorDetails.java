package com.enesergen.e_commerce.exception;

public class ErrorDetails {
    private int statusCode;
    private int errorCode;
    private String message;
    private String details;

    public ErrorDetails(int statusCode, int errorCode, String message, String details) {
        super();
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
        this.details = details;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
