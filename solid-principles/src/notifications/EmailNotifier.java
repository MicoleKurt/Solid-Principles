package notifications;

import interfaces.Notifier;

/**
 * SRP: This class only handles email notifications.
 * OCP: To add SMS or push notifications, create a new Notifier implementation
 *      without touching this class.
 * LSP: Any Notifier implementation is interchangeable here.
 */
public class EmailNotifier implements Notifier {

    @Override
    public void sendNotification(String recipient, String message) {
        // Simulate sending an email
        System.out.println("Email sent to: " + recipient + " | Message: " + message);
    }
}
