package com.nihir.rev.annotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void start() {
        System.out.println("Starting Engine");
    }
}
