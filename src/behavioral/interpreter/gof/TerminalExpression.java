package behavioral.interpreter.gof;

public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("Called Terminal.Interpret()");
    }
}
