class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double totalCost;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost() {
        return vehicle.calculateRentalRate(days);
    }

    @Override
    public String toString() {
        return String.format("%s rented %s for %d days. Total cost: ₹%.2f", customer, vehicle, days, totalCost);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}