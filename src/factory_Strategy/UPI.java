package factory_Strategy;

public class UPI implements PaymentStrategy{
    @Override
    public String pay() {
        return "UPI Payment Sucessful";
    }
}
