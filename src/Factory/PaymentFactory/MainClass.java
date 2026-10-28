package Factory.PaymentFactory;

public class MainClass {
    public static void main(String [] args) {
        PaymentFactory factory= new PaymentFactory();
        PaymentService service = factory.getPaymentDetails("upi");
        service.pay();
    }
}
