package factory_Strategy;


public class googlePay implements PaymentStrategy{
    @Override
    public String pay() {
        return "Google Pay Payment Done";
    }
}
