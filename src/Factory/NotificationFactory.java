package Factory;

public class NotificationFactory {
    public NotificationService factory(String val){
        switch(val) {
            case "EMAIL":
                return new EmailNotifier();

            case "SMS":
                return new SMSNotifier();

                default:
                throw new IllegalArgumentException(
                        "Invalid notification type: " + val
                );
        }
    }
}
