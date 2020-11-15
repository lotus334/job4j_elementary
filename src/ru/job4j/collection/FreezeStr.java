package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        final boolean[] isEnough = {true};
        List<String> listLeft = new ArrayList<>(List
                .of(left.split("")));
        List<String> listRigth = new ArrayList<>(List
                .of(right.split("")));
        Map<String, Integer> mapLeft = new HashMap<>();
        Map<String, Integer> mapRight = new HashMap<>();
        listLeft.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                mapLeft.computeIfPresent(s, (key, val) -> val + 1);
                mapLeft.putIfAbsent(s, 1);
            }
        });
        listRigth.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                mapRight.computeIfPresent(s, (key, val) -> val + 1);
                mapRight.putIfAbsent(s, 1);
            }
        });
        mapRight.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                if (mapLeft.getOrDefault(s, 0) < integer) {
                    isEnough[0] = false;
                }
            }
        });
        return isEnough[0];
    }
}
