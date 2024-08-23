class Bike extends Vehicle {
    private boolean isElectric;

    public Bike(String registrationNumber, String brand, String model, boolean isElectric) {
        super(registrationNumber, brand, model);
        this.isElectric = isElectric;
    }

    @Override
    public double calculateRentalRate(int days) {
        return (isElectric ? 2625.0 : 2250.0) * days; // 35 USD * 75 INR/USD = 2625 INR, 30 USD * 75 INR/USD = 2250 INR
    }
}