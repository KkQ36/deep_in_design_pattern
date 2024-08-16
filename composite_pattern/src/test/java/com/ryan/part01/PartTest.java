package com.ryan.part01;

import org.junit.Test;

/**
 * @author kq
 * 2024-08-16 20:31
 **/
public class PartTest {

    @Test
    public void testPart() {
        Composite root = new Composite("root");
        root.add(new Leaf("leaf1"));
        root.add(new Leaf("leaf2"));
        Composite composite1 = new Composite("composite1");
        Composite composite2 = new Composite("composite2");
        composite1.add(new Leaf("c::leaf3"));
        root.add(composite1);
        root.add(composite2);
        root.display(1);
    }

}