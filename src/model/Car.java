package model;

import service.Refuelable;

public class Car extends Vehicle implements Refuelable {
    public Car(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public void start() {
        System.out.println("Car is working");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling");
    }
}
