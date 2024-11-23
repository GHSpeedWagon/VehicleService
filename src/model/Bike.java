package model;

import service.Refuelable;

public class Bike extends Vehicle{
    public Bike(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }
}
