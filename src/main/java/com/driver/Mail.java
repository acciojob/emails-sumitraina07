package com.driver;

import java.util.Date;

public class Mail {

    private Date date;

    private String sender;

    private String message;

    //constructors
    public Mail() {
    }

    public Mail(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }

    //getters

    public Date getDate() {
        return date;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}
