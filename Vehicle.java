abstract class Vehicle {
    private final String registrationNumber;
    private String brand;
    private String model;

    public Vehicle(String registrationNumber, String brand, String model) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.model = model;
    }

    public abstract double calculateRentalRate(int days);

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", brand, model, registrationNumber);
    }
}