package behavioral.command;

import behavioral.command.orders.Broker;
import behavioral.command.orders.BuyStock;
import behavioral.command.orders.SellStock;
import behavioral.command.orders.Stock;
import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
