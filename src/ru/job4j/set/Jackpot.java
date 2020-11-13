package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> set = new HashSet<>();
        for (String elem : combination) {
            set.add(elem);
        }
        return set.size() == 1;
    }
}