package com.ryan.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @author kq
 * 2024-08-14 15:47
 **/
public class Composite extends Component {

    private final Map<Component, Map<String, Object>> children = new HashMap<>();

    @Override
    public void add(Component component) {
        children.put(component, new HashMap<>());
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Double calculate(Map<String, Object> params) {
        Set<Map.Entry<Component, Map<String, Object>>> entries = children.entrySet();
        Double res = 0.0;
        for (Map.Entry<Component, Map<String, Object>> entry : entries) {
            Component key = entry.getKey();
            Double calculate = key.calculate(params);
            res += calculate;
        }
        return res;
    }

}
