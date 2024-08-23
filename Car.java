class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String registrationNumber, String brand, String model, int numberOfSeats) {
        super(registrationNumber, brand, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateRentalRate(int days) {
        return 3750.0 * days; // 50 USD * 75 INR/USD = 3750 INR
    }
}