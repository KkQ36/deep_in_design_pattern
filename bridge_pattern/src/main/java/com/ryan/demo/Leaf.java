package com.ryan.demo;

import java.util.Map;

/**
 * @author kq
 * 2024-08-14 15:45
 **/
public class Leaf extends Component{
    @Override
    public void add(Component component) {
        throw new RuntimeException("leaf component can not add");
    }

    @Override
    public void remove(Component component) {
        throw new RuntimeException("leaf component can not remove");
    }

    @Override
    public Double calculate(Map<String, Object> params) {
        return 100.0;
    }

}
