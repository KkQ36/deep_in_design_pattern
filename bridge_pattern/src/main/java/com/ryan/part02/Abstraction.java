package com.ryan.part02;

/**
 * @author kq
 * 2024-08-12 14:52
 **/
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();

}
