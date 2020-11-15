package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Article {
    public static boolean generateBy(String origin, String line) {
        final boolean[] isEnough = {true};
        Map<String, Integer> originMap = new HashMap<>();
        Map<String, Integer> lineMap = new HashMap<>();
        List<String> originList = new ArrayList<>(List
                .of(origin
                        .replaceAll("[?!;:,.]", "")
                        .toLowerCase()
                        .split(" ")));
        List<String> lineList = new ArrayList<>(List
                .of(line
                        .replaceAll("[?!;:,.]", "")
                        .toLowerCase()
                        .split(" ")));
        originList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                originMap.computeIfPresent(s, (key, val) -> val + 1);
                originMap.putIfAbsent(s, 1);
            }
        });
        lineList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                lineMap.computeIfPresent(s, (key, val) -> val + 1);
                lineMap.putIfAbsent(s, 1);
            }
        });
        lineMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                if (originMap.getOrDefault(s, 0) < integer) {
                    isEnough[0] = false;
                }
            }
        });
        return isEnough[0];
    }
}
