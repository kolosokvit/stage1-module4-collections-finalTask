package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (String s : sourceMap.keySet()) {
            if (!resultMap.containsKey(s.length())) {
                resultMap.put(s.length(), new HashSet<>());
                resultMap.get(s.length()).add(s);
            } else {
                resultMap.get(s.length()).add(s);
            }
        }
        return resultMap;
    }
}
