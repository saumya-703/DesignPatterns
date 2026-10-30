package Strategy;

public class UPI implements PaymentStaretgy{

    @Override
    public void pay() {
        System.out.println("upi payment");
    }
}
