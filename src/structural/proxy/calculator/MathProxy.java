package structural.proxy.calculator;

public class MathProxy implements Math {

    Math math;

    public MathProxy() {
        math = new MathImp();
    }

    @Override
    public double add(double x, double y) {
        return math.add(x,y);
    }

    @Override
    public double subtract(double x, double y) {
        return math.subtract(x,y);
    }

    @Override
    public double multiply(double x, double y) {
        return math.multiply(x,y);
    }

    @Override
    public double divide(double x, double y) {
        return math.divide(x,y);
    }
}
