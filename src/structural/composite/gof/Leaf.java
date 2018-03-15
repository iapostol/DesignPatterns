package structural.composite.gof;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.print("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.print("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(new String(new char[depth]).replace('\0','-') + name);
    }
}
