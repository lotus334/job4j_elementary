package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min((str1, str2) -> Integer.compare(str1.length(), str2.length())).get();
    }
}
