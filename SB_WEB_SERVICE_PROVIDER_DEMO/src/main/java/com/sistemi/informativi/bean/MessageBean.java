package com.sistemi.informativi.bean;


public class MessageBean {

    private String message;

    public MessageBean(String message) {
        this.message = message;
    }

    protected MessageBean() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
