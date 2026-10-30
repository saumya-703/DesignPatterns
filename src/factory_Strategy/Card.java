package factory_Strategy;

public class Card implements PaymentStrategy{
    @Override
    public String pay() {
        return "Card Payment Successful";
    }
}
