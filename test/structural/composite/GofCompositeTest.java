package structural.composite;

import org.junit.Test;
import structural.composite.gof.Composite;
import structural.composite.gof.Leaf;

public class GofCompositeTest {

    @Test
    public void testComposite() {

        // Create a tree structure
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf Xa"));
        comp.add(new Leaf("Leaf Xb"));

        root.add(comp);
        root.add(new Leaf("Leaf C"));

        // Add and remove a leaf
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        // Recursively display tree
        root.display(1);
    }
}
