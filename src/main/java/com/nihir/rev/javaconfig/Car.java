package com.nihir.rev.javaconfig;

public class Car {

    private Engine engine;

    // constructor injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Starting Car");
        engine.start();
        System.out.println("Car started");
    }
}
