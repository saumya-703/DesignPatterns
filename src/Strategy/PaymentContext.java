package Strategy;

public class PaymentContext {
    private PaymentStaretgy ps;
    public PaymentContext(PaymentStaretgy ps){
        this.ps=ps;
    }
    public void pay(){
        ps.pay();
    }
}
