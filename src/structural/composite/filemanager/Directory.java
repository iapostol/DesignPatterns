package structural.composite.filemanager;

import structural.composite.gof.Component;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Resource {

    private List<Resource> includedResources = new ArrayList();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void show(int depth) {
        System.out.println(new String(new char[depth]).replace('\0','-') + name);

        for (Resource r: includedResources) {
            r.show(depth + 2);
        }
    }

    @Override
    public void add(Resource r) {
        includedResources.add(r);
    }

    @Override
    public void remove(Resource r) {
        includedResources.remove(r);
    }
}