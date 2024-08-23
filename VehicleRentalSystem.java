import java.util.Scanner;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding sample data
        rentalSystem.addVehicle(new Car("CAR001", "Toyota", "Camry", 5));
        rentalSystem.addVehicle(new Car("CAR002", "Honda", "Civic", 5));
        rentalSystem.addVehicle(new Bike("BIKE001", "Giant", "Defy", false));
        rentalSystem.addVehicle(new Bike("BIKE002", "Trek", "Domane", true));

        rentalSystem.addCustomer(new Customer("CUST001", "John Doe", "1234567890"));
        rentalSystem.addCustomer(new Customer("CUST002", "Jane Smith", "0987654321"));

        while (true) {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a vehicle");
            System.out.println("3. Display available vehicles");
            System.out.println("4. Display current rentals");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle registration number: ");
                    String regNumber = scanner.nextLine();
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter rental duration (days): ");
                    int days = scanner.nextInt();
                    rentalSystem.rentVehicle(regNumber, customerId, days);
                    break;
                case 2:
                    System.out.print("Enter vehicle registration number to return: ");
                    String returnRegNumber = scanner.nextLine();
                    rentalSystem.returnVehicle(returnRegNumber);
                    break;
                case 3:
                    rentalSystem.displayAvailableVehicles();
                    break;
                case 4:
                    rentalSystem.displayRentals();
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
