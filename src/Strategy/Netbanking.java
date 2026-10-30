package Strategy;

public class Netbanking implements PaymentStaretgy{
    @Override
    public void pay() {
        System.out.println("NetBanking payment");
    }
}
