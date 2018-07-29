package behavioral.visitor.market.visitors;

import behavioral.visitor.market.visitables.Liquor;
import behavioral.visitor.market.visitables.Necessity;
import behavioral.visitor.market.visitables.Tobacco;

public interface Visitor {

    double visit(Liquor liquorItem);

    double visit(Tobacco tobaccoItem);

    double visit(Necessity necessityItem);
}
