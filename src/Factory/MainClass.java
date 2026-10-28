package Factory;

public class MainClass {
    public static void main(String [] args) {
        NotificationFactory factory = new NotificationFactory();
        NotificationService service = factory.factory("EMAIL");
        service.sendNotification();
        service = factory.factory("SMS");
        service.sendNotification();
    }
}
