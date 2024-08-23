class Customer {
    private final String id;
    private String name;
    private String contactNumber;

    public Customer(String id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %s)", name, id);
    }
}