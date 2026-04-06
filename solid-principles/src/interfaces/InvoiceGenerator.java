package interfaces;

/**
 * ISP: Invoice generation is its own interface.
 * Not all orders need invoice generation, so it is decoupled from Order.
 */
public interface InvoiceGenerator {
    void generateInvoice(String fileName);
}
