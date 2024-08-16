package com.ryan.part01;

import java.util.ArrayList;

/**
 * @author kq
 * 2024-08-16 20:28
 **/
public class Composite extends Component{

    private final ArrayList<Component> children = new ArrayList<>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }

}
