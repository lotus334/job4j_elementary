package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String str) {
        String s = str.replaceAll(" ", "");
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int finalI = i;
            map.computeIfPresent(s.charAt(i), (key, list) -> {
                list.add(finalI);
                return list;
            });
            map.putIfAbsent(s.charAt(i), new ArrayList<>(List.of(i)));
        }
        return map;
    }
}