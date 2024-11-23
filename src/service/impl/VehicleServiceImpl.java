package service.impl;

import model.Bike;
import model.Car;
import model.Truck;
import model.Vehicle;
import service.Refuelable;
import service.VehicleService;

import java.util.List;
import java.util.Scanner;

public class VehicleServiceImpl implements VehicleService  {
    @Override
    public Vehicle createVehicle(Scanner scanner, String type) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        return switch (type) {
            case "Car" -> new Car(make, model, year);
            case "Bike" -> new Bike(make, model, year);
            case "Truck" -> new Truck(make, model, year);
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        };
    }

    @Override
    public void listVehicles(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println((i + 1) + " - " + vehicles.get(i));
        }

    }

    @Override
    public void performActionOnVehicle(List<Vehicle> vehicles, Scanner scanner, String action) {
        listVehicles(vehicles);
        if (vehicles.isEmpty()) return;

        System.out.print("Choose a vehicle number: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < vehicles.size()) {
            if ("start".equals(action)) {
                vehicles.get(index).start();
            } else if ("stop".equals(action)) {
                vehicles.get(index).stop();
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    @Override
    public void performRefuel(List<Vehicle> vehicles, Scanner scanner) {
        listVehicles(vehicles);
        if (vehicles.isEmpty()) return;

        System.out.print("Choose a vehicle number: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < vehicles.size()) {
            Vehicle vehicle = vehicles.get(index);
            if (vehicle instanceof Refuelable refuelable) {
                refuelable.refuel();
            } else {
                System.out.println("This vehicle cannot be refueled.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
