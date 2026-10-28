package Factory.NotoficationFactory;

public class SMSNotifier implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}
