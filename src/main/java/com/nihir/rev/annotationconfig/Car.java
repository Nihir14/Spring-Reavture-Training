package com.nihir.rev.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;

    public void start() {
        System.out.println("Starting Car");
        engine.start();
        System.out.println("Car started");
    }
}
