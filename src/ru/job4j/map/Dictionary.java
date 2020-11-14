package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String word : strings) {

            rsl.computeIfPresent(String.valueOf(word.charAt(0)), new BiFunction<String, List<String>, List<String>>() {
                @Override
                public List<String> apply(String s, List<String> strings) {
                    List<String> list = new ArrayList<>(strings);
                    list.add(word);
                    return list;
                }
            });

//            rsl.computeIfPresent(String.valueOf(word.charAt(0)), (key, list) -> {
//                List<String> newList = new ArrayList<>();
//                list.forEach(el -> newList.add(el));
//                newList.add(word);
//                return newList;
//            });

            rsl.putIfAbsent(String.valueOf(word.charAt(0)), List.of(word));
        }
        return rsl;
    }
}