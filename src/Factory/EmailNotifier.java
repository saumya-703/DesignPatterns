package Factory;

public class EmailNotifier implements NotificationService{

    @Override
    public void sendNotification() {
        System.out.print("Email Notification Sent");
    }
}
