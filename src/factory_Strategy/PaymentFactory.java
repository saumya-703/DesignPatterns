package factory_Strategy;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(PaymentType p){
        switch(p) {
            case UPI:
                return new UPI();
            case CARD:
                return new Card();
            case NETBANKING:
                return new Netbanking();
            case GOOGLEPAY:
                return new googlePay();
            default:
                throw new IllegalArgumentException("wrong choice");
        }
    }
}
