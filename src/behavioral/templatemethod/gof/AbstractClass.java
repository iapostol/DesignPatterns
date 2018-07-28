package behavioral.templatemethod.gof;

public abstract class AbstractClass

{
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void TemplateMethod()
    {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
