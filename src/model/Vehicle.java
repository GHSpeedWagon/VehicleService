package model;

public abstract class Vehicle {
    private final String model;
    private final String make;
    private final int year;

    public Vehicle(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
