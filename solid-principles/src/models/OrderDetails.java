package models;

/**
 * SRP: This class only holds order data. No logic, no I/O.
 */
public class OrderDetails {
    private final String customerName;
    private final String address;
    private final double price;
    private final int quantity;

    public OrderDetails(String customerName, String address, double price, int quantity) {
        this.customerName = customerName;
        this.address = address;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCustomerName() { return customerName; }
    public String getAddress()      { return address; }
    public double getPrice()        { return price; }
    public int getQuantity()        { return quantity; }
}
