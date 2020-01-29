package com.redhat.fuse.boosters.rest.http;

public interface GreetingsService {
    
    Greetings getGreetings( String name);
    Greetings generalGreetings( String greetings);

}