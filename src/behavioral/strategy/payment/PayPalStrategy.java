package behavioral.strategy.payment;

public class PayPalStrategy implements PaymentStrategy {

    public PayPalStrategy(){
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}