package com.redhat.fuse.boosters.rest.http;

public class Greetings {

    private String greetings;

    public Greetings() {
    }

    public Greetings(String greetings) {
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

}