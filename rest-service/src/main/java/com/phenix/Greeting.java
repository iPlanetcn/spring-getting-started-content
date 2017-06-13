package com.phenix;


public class Greeting {
    private final Integer id;
    private final String message;

    public Greeting(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
