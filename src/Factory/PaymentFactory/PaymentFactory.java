package Factory.PaymentFactory;

public class PaymentFactory {
    public PaymentService getPaymentDetails(String val){
        switch(val){
            case "upi":
                return new UPI();

            case "netBanking":
                return new NetBanking();

            case "creditcard":
                return new CreditCard();

            default:
                throw new IllegalArgumentException("wrong demand");
        }
    }
}
