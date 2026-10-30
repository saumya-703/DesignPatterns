package factory_Strategy;

public class PaymentService{
    public String processPayment(PaymentType p){
        PaymentStrategy s= PaymentFactory.getPaymentStrategy(p);
        return s.pay();
    }
}
