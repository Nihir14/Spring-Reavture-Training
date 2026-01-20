package com.nihir.rev.xmlconfig;

public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Starting Car");
        engine.start();
        System.out.println("Car started");

    }
}
