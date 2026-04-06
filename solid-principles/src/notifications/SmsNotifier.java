package notifications;

import interfaces.Notifier;

/**
 * OCP: A new notification channel added WITHOUT modifying any existing class.
 * LSP: Fully substitutable for EmailNotifier wherever Notifier is expected.
 */
public class SmsNotifier implements Notifier {

    @Override
    public void sendNotification(String recipient, String message) {
        // Simulate sending an SMS
        System.out.println("SMS sent to: " + recipient + " | Message: " + message);
    }
}
