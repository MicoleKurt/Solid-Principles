package interfaces;

/**
 * ISP + SRP: This interface only defines core order operations.
 * Invoice and notification responsibilities are separated into their own interfaces.
 */
public interface Order {
    void calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}
