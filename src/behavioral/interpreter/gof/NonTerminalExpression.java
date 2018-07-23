package behavioral.interpreter.gof;

public class NonTerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("Called NonTerminal.Interpret()");
    }
}
