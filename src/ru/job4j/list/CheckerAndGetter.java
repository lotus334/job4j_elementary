package ru.job4j.list;

import java.util.List;

public class CheckerAndGetter {
    public static String getElement(List<String> list) {
        return list.isEmpty() ? "" : list.get(0);
    }
}
