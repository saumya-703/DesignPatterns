package Factory.PaymentFactory;

public class CreditCard implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }
}
