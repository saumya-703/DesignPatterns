package factory_Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService ps= new PaymentService();
        System.out.println(ps.processPayment(PaymentType.UPI));
        System.out.println(ps.processPayment(PaymentType.CARD));
        System.out.println(ps.processPayment(PaymentType.NETBANKING));
        System.out.println(ps.processPayment(PaymentType.GOOGLEPAY));
    }
}
