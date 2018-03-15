package structural.composite.filemanager;

public class File extends Resource {
    public File(String name) {
        super(name);
    }

    @Override
    public void show(int depth) {
        System.out.println(new String(new char[depth]).replace('\0','-') + name);
    }

    @Override
    public void add(Resource resource) {
        System.out.print("Cannot add to a file");
    }

    @Override
    public void remove(Resource r) {
        System.out.print("Cannot delete from a file");
    }
}
