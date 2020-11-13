package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder result = new StringBuilder();
        List<String> letters = new ArrayList<>(List.of(s.split("")));
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        letters.sort(comparator);
        letters.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                result.append(s);
            }
        });
        return result.toString();
    }
}