package factory_Strategy;

import factory_Strategy.PaymentStrategy;

public class Netbanking implements PaymentStrategy {
    @Override
    public String pay() {
        return "NetBanking Payment successful";
    }
}
