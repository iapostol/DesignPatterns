package structural.proxy.calculator;

public class MathImp implements Math {
    @Override
    public double add(double x, double y) {
        return x + y;
    }

    @Override
    public double subtract(double x, double y) {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double divide(double x, double y) {

        if (y == 0)
            throw new RuntimeException("denominator is 0");

        return x / y;
    }
}
