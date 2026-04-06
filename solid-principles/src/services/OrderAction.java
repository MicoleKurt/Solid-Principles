package services;

import interfaces.Order;

/**
 * SRP: OrderAction only handles core order operations (calculate & place).
 * ISP: It does NOT implement InvoiceGenerator or Notifier —
 *      those are not its responsibility.
 */
public class OrderAction implements Order {

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
