package com.ryan.part02.impl;

import com.ryan.part02.Abstraction;
import com.ryan.part02.Implementor;

/**
 * @author kq
 * 2024-08-12 14:52
 **/
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        System.out.println("具体的 Abstraction");
        implementor.operation();
    }

}
