package com.rocket_code.pruebatecnica.utils;

public class Response<T> {
    private T data;
    private String message;
    private int statusCode;
    private boolean success;

    public Response(T data, String message, int statusCode, boolean success) {
        this.data = data;
        this.message = message;
        this.statusCode = statusCode;
        this.success = success;
    }
    public Response() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
