package model;

import service.Refuelable;

public class Truck extends Vehicle implements Refuelable {
    public Truck(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }
}
