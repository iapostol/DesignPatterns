package structural.facade.gof;

public class Facade {

    private SubSystemOne _one;
    private SubSystemTwo _two;
    private SubSystemThree _three;
    private SubSystemFour _four;


    public Facade() {
        _one = new SubSystemOne();
        _two = new SubSystemTwo();
        _three = new SubSystemThree();
        _four = new SubSystemFour();
    }

    public void MethodA() {
        System.out.println("\nMethodA() ---- ");
        _one.methodOne();
        _two.methodTwo();
        _four.MethodFour();
    }

    public void MethodB() {
        System.out.println("\nMethodB() ---- ");
        _two.methodTwo();
        _three.methodThree();
    }
}
