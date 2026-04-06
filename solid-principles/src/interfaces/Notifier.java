package interfaces;

/**
 * ISP: Notification is its own interface.
 * Allows different notification strategies (email, SMS, push) without touching Order.
 * OCP: New notifier types can be added without modifying existing code.
 */
public interface Notifier {
    void sendNotification(String recipient, String message);
}
