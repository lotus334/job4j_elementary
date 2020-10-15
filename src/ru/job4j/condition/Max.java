package ru.job4j.condition;

import ru.job4j.array.SortSelected;

public class Max {
    public static int max(int... args) {
        return SortSelected.sort(args)[args.length - 1];
    }
}