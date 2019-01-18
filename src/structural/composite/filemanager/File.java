package structural.composite.filemanager;

public class File extends Resource {
    public File(String name) {
        super(name);
    }

    @Override
    public void show(int depth) {
        System.out.println(new String(new char[depth]).replace('\0','-') + name);
    }
}
