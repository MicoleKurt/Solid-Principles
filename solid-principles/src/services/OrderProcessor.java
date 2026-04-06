package services;

import interfaces.InvoiceGenerator;
import interfaces.Notifier;
import interfaces.Order;
import models.OrderDetails;

/**
 * DIP: OrderProcessor depends on the abstractions Order, InvoiceGenerator,
 *      and Notifier — NOT on concrete classes like OrderAction, PdfInvoiceGenerator,
 *      or EmailNotifier.
 *
 * The concrete implementations are injected via the constructor,
 * making this class flexible, testable, and easy to extend.
 */
public class OrderProcessor {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final Notifier notifier;

    // Constructor Injection — concrete dependencies provided from outside
    public OrderProcessor(Order order, InvoiceGenerator invoiceGenerator, Notifier notifier) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.notifier = notifier;
    }

    public void process(OrderDetails details, String invoiceFileName, String recipientContact) {
        order.calculateTotal(details.getPrice(), details.getQuantity());
        order.placeOrder(details.getCustomerName(), details.getAddress());
        invoiceGenerator.generateInvoice(invoiceFileName);
        notifier.sendNotification(recipientContact, "Your order has been placed successfully!");
    }
}
