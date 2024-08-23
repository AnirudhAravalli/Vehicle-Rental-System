import java.util.ArrayList;
import java.util.List;

class RentalSystem {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<Rental> rentals;

    public RentalSystem() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentVehicle(String vehicleRegNumber, String customerId, int days) {
        Vehicle vehicle = findVehicle(vehicleRegNumber);
        Customer customer = findCustomer(customerId);

        if (vehicle != null && customer != null) {
            Rental rental = new Rental(vehicle, customer, days);
            rentals.add(rental);
            vehicles.remove(vehicle);
            System.out.println("Rental created successfully.");
            System.out.println(rental);
        } else {
            System.out.println("Vehicle or customer not found.");
        }
    }

    public void returnVehicle(String vehicleRegNumber) {
        Rental rentalToRemove = rentals.stream()
                .filter(r -> r.getVehicle().getRegistrationNumber().equals(vehicleRegNumber))
                .findFirst()
                .orElse(null);

        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            vehicles.add(rentalToRemove.getVehicle());
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Rental not found.");
        }
    }

    private Vehicle findVehicle(String regNumber) {
        return vehicles.stream()
                .filter(v -> v.getRegistrationNumber().equals(regNumber))
                .findFirst()
                .orElse(null);
    }

    private Customer findCustomer(String id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        vehicles.forEach(System.out::println);
    }

    public void displayRentals() {
        System.out.println("Current Rentals:");
        rentals.forEach(System.out::println);
    }
}