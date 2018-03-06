package creational.builder.gof;

public class DirectorBuilder {

    Builder builder;

    public DirectorBuilder(Builder builder) {
        this.builder = builder;
    }

    public void Construct() {
        this.builder.BuildPart();
    }

    public Product getProduct() {
        return this.builder.GetResult();
    }
}
