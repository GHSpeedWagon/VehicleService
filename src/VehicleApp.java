import model.Vehicle;
import service.VehicleService;
import service.impl.VehicleServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleServiceImpl();
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1 - Create a Car");
            System.out.println("2 - Create a Bike");
            System.out.println("3 - Create a Truck");
            System.out.println("4 - List Vehicles");
            System.out.println("5 - Start a Vehicle");
            System.out.println("6 - Stop a Vehicle");
            System.out.println("7 - Refuel a Vehicle");
            System.out.println("8 - Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> vehicles.add(vehicleService.createVehicle(scanner, "Car"));
                case 2 -> vehicles.add(vehicleService.createVehicle(scanner, "Bike"));
                case 3 -> vehicles.add(vehicleService.createVehicle(scanner, "Truck"));
                case 4 -> vehicleService.listVehicles(vehicles);
                case 5 -> vehicleService.performActionOnVehicle(vehicles, scanner, "start");
                case 6 -> vehicleService.performActionOnVehicle(vehicles, scanner, "stop");
                case 7 -> vehicleService.performRefuel(vehicles, scanner);
                case 8 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Goodbye!");
    }
}