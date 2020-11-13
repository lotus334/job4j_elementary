package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> set = new HashSet<>();
        s = s.toLowerCase();
        boolean pangram = true;
        for (int i = 97; i < 123; i++) {
            set.add((char) i);
        }
        for (Character ch : set) {
            if (s.indexOf(ch) == -1) {
                pangram = false;
                break;
            }
        }
        return pangram;
    }
}