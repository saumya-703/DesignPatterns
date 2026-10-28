package Factory.PaymentFactory;

public class UPI implements PaymentService{

    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}
