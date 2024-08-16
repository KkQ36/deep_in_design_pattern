package com.ryan.part02;

import com.ryan.part02.impl.ConcreteImplementorA;
import com.ryan.part02.impl.ConcreteImplementorB;
import com.ryan.part02.impl.RefinedAbstraction;
import org.junit.Test;

/**
 * @author kq
 * @description 大话设计模式-桥接模式 测试
 * @create 2024-08-11 22:11
 */
public class PartTest {

    /**
     * 桥接模式测试
     */
    @Test
    public void testPart01() {
        Abstraction ab;
        ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }

}
