package behavioral.strategy;

import behavioral.strategy.payment.CreditCardStrategy;
import behavioral.strategy.payment.Item;
import behavioral.strategy.payment.PayPalStrategy;
import behavioral.strategy.payment.ShoppingCart;
import org.junit.Test;

public class PaymentStrategyTester {

    @Test
    public void testPaymentStrategy() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by PayPal
        cart.pay(new PayPalStrategy());

        //pay by credit card
        cart.pay(new CreditCardStrategy());
    }
}
