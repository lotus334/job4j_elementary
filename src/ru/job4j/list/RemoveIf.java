package ru.job4j.list;

import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        Predicate<String> isLongerThanFive = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 5;
            }
        };

        list.removeIf(isLongerThanFive);
        return list;
    }
}