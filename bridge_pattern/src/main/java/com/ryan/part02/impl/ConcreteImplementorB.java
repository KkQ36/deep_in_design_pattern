package com.ryan.part02.impl;

import com.ryan.part02.Implementor;

/**
 * @author kq
 * 2024-08-12 14:51
 **/
public class ConcreteImplementorB extends Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现 B 方法执行");
    }

}
