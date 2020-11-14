package ru.job4j.map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        final char[] rsl = {' '};
        final Integer[] max = {0};
        List<String> list = new ArrayList<>(List.of(str.toLowerCase().split("")));
        list.removeAll(List.of(" "));

        list.forEach(s -> map.computeIfAbsent(s.charAt(0), key -> 1));

        list.forEach(s -> map.computeIfPresent(s.charAt(0), (key, val) -> map.get(key) + 1));

//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                map.computeIfPresent(s.charAt(0), new BiFunction<Character, Integer, Integer>() {
//                    @Override
//                    public Integer apply(Character s, Integer integer) {
//                        return map.get(s) + 1;
//                    }
//                });
//                map.computeIfAbsent(s.charAt(0), new Function<Character, Integer>() {
//                    @Override
//                    public Integer apply(Character s) {
//                        return 1;
//                    }
//                });
//            }
//        });

        map.values().forEach(val -> max[0] = val > max[0] ? val : max[0]);

//        map.values().forEach(val -> {
//            if (val > max[0]) {
//                max[0] = val;
//            }
//        });

//        map.values().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                if (integer > max[0]) {
//                    max[0] = integer;
//                }
//            }
//        });

        for (Character key : map.keySet()) {
            if (map.get(key) == max[0]) {
                rsl[0] = key;
                break;
            }
        }

        return rsl[0];
    }
}