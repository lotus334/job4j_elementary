package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String elem : strings) {
            map.computeIfPresent(elem, (key, val) -> true);
            map.putIfAbsent(elem, false);
        }
        return map;
    }
}