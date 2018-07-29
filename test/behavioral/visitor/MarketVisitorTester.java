package behavioral.visitor;

import behavioral.visitor.market.visitables.Liquor;
import behavioral.visitor.market.visitables.Necessity;
import behavioral.visitor.market.visitables.Tobacco;
import behavioral.visitor.market.visitors.TaxHolidayVisitor;
import behavioral.visitor.market.visitors.TaxVisitor;
import org.junit.Test;

public class MarketVisitorTester {
    @Test
    public void testMarketVisitor() {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc) + "\n");
        System.out.println(vodka.accept(taxCalc) + "\n");
        System.out.println(cigars.accept(taxCalc) + "\n");

        System.out.println("TAX HOLIDAY PRICES\n");

        System.out.println(milk.accept(taxHolidayCalc) + "\n");
        System.out.println(vodka.accept(taxHolidayCalc) + "\n");
        System.out.println(cigars.accept(taxHolidayCalc) + "\n");
    }
}
