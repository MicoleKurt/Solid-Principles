import models.OrderDetails;
import notifications.EmailNotifier;
import notifications.SmsNotifier;
import services.OrderAction;
import services.OrderProcessor;
import services.PdfInvoiceGenerator;

/**
 * Demonstrates all 5 SOLID principles working together.
 *
 * S - Single Responsibility : Each class has one reason to change.
 * O - Open/Closed           : Add SmsNotifier without modifying existing classes.
 * L - Liskov Substitution   : EmailNotifier and SmsNotifier are interchangeable as Notifier.
 * I - Interface Segregation : Order, InvoiceGenerator, and Notifier are separate interfaces.
 * D - Dependency Inversion  : OrderProcessor depends on abstractions, not concrete classes.
 */
public class OrderTest {
    public static void main(String[] args) {

        OrderDetails details = new OrderDetails("John Doe", "123 Main St", 10.0, 2);

        // --- Using Email Notification ---
        System.out.println("=== Order with Email Notification ===");
        OrderProcessor emailOrderProcessor = new OrderProcessor(
            new OrderAction(),
            new PdfInvoiceGenerator(),
            new EmailNotifier()         // DIP: inject concrete implementation
        );
        emailOrderProcessor.process(details, "order_123.pdf", "johndoe@example.com");

        System.out.println();

        // --- OCP & LSP in action: swap to SMS without changing any existing class ---
        System.out.println("=== Order with SMS Notification ===");
        OrderProcessor smsOrderProcessor = new OrderProcessor(
            new OrderAction(),
            new PdfInvoiceGenerator(),
            new SmsNotifier()           // OCP: new behavior, zero modifications to existing code
        );
        smsOrderProcessor.process(details, "order_124.pdf", "+63-912-345-6789");
    }
}
