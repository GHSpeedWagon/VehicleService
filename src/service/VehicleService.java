package service;

import model.Vehicle;

import java.util.List;
import java.util.Scanner;

public interface VehicleService {
    Vehicle createVehicle(Scanner scanner, String type);
    void listVehicles(List<Vehicle> vehicles);
    void performActionOnVehicle(List<Vehicle> vehicles, Scanner scanner, String action);
    void performRefuel(List<Vehicle> vehicles, Scanner scanner);
}
