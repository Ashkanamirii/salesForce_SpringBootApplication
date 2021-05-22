package com.example.salesforce.exception;
import java.util.Date;
/**
 * Created by Ashkan Amiri
 * Date:  2021-05-22
 * Time:  12:15
 * Project: salesForce
 * Copyright: MIT
 */


public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
