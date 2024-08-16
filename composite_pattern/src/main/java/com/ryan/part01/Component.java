package com.ryan.part01;

/**
 * @author kq
 * 2024-08-16 20:26
 **/
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 添加节点
     * @param component 节点
     */
    public abstract void add(Component component);


    /**
     * 移除节点
     * @param component 节点
     */
    public abstract void remove(Component component);

    /**
     * 展示节点结构
     * @param depth 控制展示前缀长度
     */
    public abstract void display(int depth);

}
