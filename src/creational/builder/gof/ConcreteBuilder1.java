package creational.builder.gof;

public class ConcreteBuilder1 implements Builder {

    @Override
    public void BuildPart() {

    }

    @Override
    public Product GetResult() {
        return new Product();
    }
}
