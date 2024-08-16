package com.ryan.part01;

/**
 * @author kq
 * 2024-08-16 20:29
 **/
public class Leaf extends Component{


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        throw new RuntimeException("叶子节点不能添加子节点");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("叶子节点不能删除子节点");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
