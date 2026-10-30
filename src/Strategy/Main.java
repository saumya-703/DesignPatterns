package Strategy;

public class Main {
    public static void main() {
        PaymentStaretgy upi= new UPI();
        PaymentContext pay= new PaymentContext(upi);
    }
}
