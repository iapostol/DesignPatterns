package structural.composite.filemanager;

public abstract class Resource {

    protected String name;

    public Resource(String name){
        this.name = name;
    }

    public abstract void show(int depth);
}
