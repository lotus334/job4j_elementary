package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        List<String> result = new ArrayList<>();
        int first = list.indexOf(el);
        int last = list.lastIndexOf(el);
        if (first != last) {
            result = list.subList(first, last);
        }
        return result;
    }
}