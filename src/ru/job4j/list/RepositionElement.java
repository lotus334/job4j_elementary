package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int lenth = list.size();
        if (index >= lenth || index < 0) {
            list.remove(list.size() - 1);
        } else {
            list.set(index, list.get(lenth - 1));
            list.remove(lenth - 1);
        }
        return list;
    }
}