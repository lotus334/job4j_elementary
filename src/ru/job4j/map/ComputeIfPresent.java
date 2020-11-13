package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
//        result.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer integer, String s) {
//                result.computeIfPresent(integer, new BiFunction<Integer, String, String>() {
//                    @Override
//                    public String apply(Integer integer, String s) {
//                        return s + " " + surname.get(integer);
//                    }
//                });
//            }
//        });
//
        for (Integer key : name.keySet()) {
            name.computeIfPresent(key, (key2, value) -> value + " " +  surname.get(key2));
        }

        return name;
    }
}