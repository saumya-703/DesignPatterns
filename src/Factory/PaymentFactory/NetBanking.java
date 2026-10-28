package Factory.PaymentFactory;

public class NetBanking implements PaymentService{

    @Override
    public void pay(){
        System.out.println("NetBanking Service");
    }

}
