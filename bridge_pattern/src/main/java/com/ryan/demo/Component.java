package com.ryan.demo;

import java.util.Map;
import java.util.Objects;

/**
 * @author kq
 * 2024-08-14 15:44
 **/
public abstract class Component {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Double calculate(Map<String, Object> params);

}
