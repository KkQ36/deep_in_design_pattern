package com.ryan.demo;

import org.junit.Test;
import java.util.HashMap;

/**
 * @author kq
 * 2024-08-14 15:53
 **/
public class DemoTest {

    @Test
    public void compositeTest() {
        Composite root = new Composite();
        Composite composite1 = new Composite();
        composite1.add(new Leaf());
        composite1.add(new Leaf());
        Composite composite2 = new Composite();
        composite1.add(new Leaf());
        root.add(composite1);
        root.add(composite2);
        System.out.println(root.calculate(new HashMap<>()));
    }

}
