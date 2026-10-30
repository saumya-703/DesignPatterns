package Strategy;

public class CreditDebitCard implements PaymentStaretgy{
    @Override
    public void pay() {
        System.out.println("Credit and Debit Card payment");
    }
}
