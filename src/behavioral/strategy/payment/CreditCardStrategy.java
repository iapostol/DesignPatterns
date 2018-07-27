package behavioral.strategy.payment;

public class CreditCardStrategy implements PaymentStrategy {

    public CreditCardStrategy(){
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");
    }

}